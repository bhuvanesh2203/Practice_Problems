package test;

import com.google.gson.JsonElement;

public class Json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
public static void compareJson(JsonElement json, JsonElement other) {
    compareJson(json, other, "");
}

private static void compareJson(JsonElement json, JsonElement other, String path) {
    if (json.equals(other)) return;

    if (json.isJsonArray() && other.isJsonArray()) {
        JsonArray arrJ = (JsonArray) json;
        JsonArray arrO = (JsonArray) other;

        int size = Math.min(arrJ.size(), arrO.size());
        for (int i = 0; i < size; i++) {
            compareJson(arrJ.get(i), arrO.get(i), path + "/" + i);
        }
        if (arrJ.size() > arrO.size()) {
            for (int i = arrO.size(); i < arrJ.size(); i++) {
                System.out.println(path + "/ deleted array value: " + arrJ.get(i));
            }
        } else if (arrJ.size() < arrO.size()) {
            for (int i = arrJ.size(); i < arrO.size(); i++) {
                System.out.println(path + "/ added array value: " + arrO.get(i));
            }
        }
    } else if (json.isJsonObject() && other.isJsonObject()) {
        JsonObject objJ = (JsonObject) json;
        JsonObject objO = (JsonObject) other;

        for (Entry<String, JsonElement> entry : objJ.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (objO.has(key)) {
                compareJson(value, objO.get(key), path + "/" + key);
            } else {
                System.out.println(path + "/ deleted object entry: \"" + key + "\": " + value);
            }
        }
        for (Entry<String, JsonElement> entry : objO.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (!objJ.has(key)) {
                System.out.println(path + "/ added object entry: \"" + key + "\": " + value);
            }
        }
    } else if (json.isJsonPrimitive() && other.isJsonPrimitive()) {
        System.out.println(path + "/ value changed: " + json + " -> " + other);
    } else {
        System.out.println(path + "/ element changed: " + json + " -> " + other);
    }
}