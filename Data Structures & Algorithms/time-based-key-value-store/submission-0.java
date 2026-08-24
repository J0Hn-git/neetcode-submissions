class TimeMap {

    class TimeValue {

        String value;
        int timeStamp;

        TimeValue(String value, int timeStamp) {
            this.value = value;
            this.timeStamp = timeStamp;
        }
    }
    private Map<String, List<TimeValue>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        timeMap.putIfAbsent(key, new ArrayList<>());
        timeMap.get(key).add(new TimeValue(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        
        if(!timeMap.containsKey(key)) {
            return "";
        }
        List<TimeValue> list = timeMap.get(key);

        int left = 0;
        int right = list.size() - 1;

        String result = "";

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(list.get(mid).timeStamp <= timestamp) {

                result = list.get(mid).value;

                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }
}
