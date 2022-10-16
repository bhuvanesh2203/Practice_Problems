package test123;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public Gson gson = new Gson();
			Type type = new TypeToken<Map<String, Object>>(){}.getType();

			Map<String, Object> expMap = gson.fromJson(expectedJson, type);
			Map<String, Object> actMap = gson.fromJson(foundJson, type);
			List<String> expMsgList=new ArrayList<>();
			List<String> actMsgList=new ArrayList<>();
			logger.info("Flatten the map inorder to compare the Nested JSON objects");
			Map<String, Object> expFlatMap = FlatMapUtil.flatten(expMap);
			Map<String, Object> actFlatMap = FlatMapUtil.flatten(actMap);
			MapDifference<String, Object> difference = Maps.difference(expFlatMap, actFlatMap);


			if(expMap.keySet().equals(actMap.keySet())) {
				if(!difference.entriesDiffering().isEmpty()) {
					difference.entriesDiffering().forEach((key, value) ->{
						String keyString=null;
						String keyStringarr[]=key.split("/");;
						if(StringUtils.isNumeric(keyStringarr[keyStringarr.length -1])) {
							keyString=keyStringarr[keyStringarr.length -2];
						}
						else {
							keyString=keyStringarr[keyStringarr.length -1];
						}
						//logger.info(keyString + " ****-->"+keyString );
						if(!(fieldSkip.contains(keyString))){
						//if(!(key.contains("createdById") || key.contains("traceFiles") || key.contains("UID") || key.contains("title") || key.contains("message") || key.contains("timestamp") || key.contains("objectTarget") || key.contains("objectUID") || key.contains("edgeGroup") || key.contains("siteGroup") || key.contains("edgeSideUid") || key.contains("addPort") || key.contains("dropPort") || key.contains("cards") || key.contains("qty") || key.contains("GPL") || key.contains("PID") || key.contains("description") || key.contains("name") || key.contains("value") || key.contains("srcPort") || key.contains("linkLabel") || key.contains("dstPort") || key.contains("srcCard")  || key.contains("site")  || key.contains("cableID") || key.contains("type") || key.contains("length")  || key.contains("destinationEdge") || key.contains("sourceEdge") || key.contains("destinationPort") || key.contains("dstSite")|| key.contains("srcSite")|| key.contains("portUID")|| key.contains("parentPortUID") || key.contains("path")|| key.contains("scalableUpToDegree") || key.contains("structure") || key.contains("SSONMediaCarriers") || key.contains("dstEdge")|| key.contains("srcEdge")|| key.contains("srcAddDropGroup")|| key.contains("dstAddDropGroup") || key.contains("workingSSONMediaChannel") || key.contains("workingPath") || key.contains("sourcePort") || key.contains("fiberLinks") || key.contains("translate"))) {
							//logger.info("values are not matching print the difference between the two files");
							String valueExp=value.toString().split(",")[0].split("\\(")[1];
							String valueAct=value.toString().split(",")[1].split("\\)")[0];
							if(keyString.equals("message")) {
								if(valueExp.contains("GENE Analysis") || valueAct.contains("GENE Analysis")) {
									return;
								}
								else {
									expMsgList.add(valueExp);
									actMsgList.add(valueAct);
									return;
								}
								
							}
							String valueforKey="EXPECTED_VALUE="+valueExp+" and ACTUAL_VALUE="+ valueAct;
							failedItems.put(key, valueforKey); 
							logger.info(key + " -->"+valueforKey );
							}
						}
						);
					logger.info("expMsgList:"+expMsgList);
					logger.info("actMsgList:"+actMsgList);
					//List<String> differences_msg = new ArrayList<>(Sets.difference(Sets.newHashSet(expMsgList), Sets.newHashSet(actMsgList)));
					List<String> differences_msg = actMsgList.stream()
				            .filter(element -> !expMsgList.contains(element))
				            .collect(Collectors.toList());
					if(differences_msg.size()>0) {
						failedItems.put("message",differences_msg.toString());
					}
				}
			} name() {
		
	}
}
