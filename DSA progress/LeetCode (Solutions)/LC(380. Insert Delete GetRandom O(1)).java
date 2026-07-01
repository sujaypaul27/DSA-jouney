class RandomizedSet {
    private HashMap<Integer ,Integer> map;
    private List<Integer> list;
    private Random random; 
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random =new Random ();
    }
    
    public boolean insert(int val) {
        boolean isExist =map.containsKey(val);
        if(!isExist)
        {
            list.add(val);
            map.put(val , list.size() -1);
        }
        return !isExist;
    }
    
    public boolean remove(int val) {
        boolean isExists =map.containsKey(val);
        if(isExists)
        {
            int index = map.get(val);
            int lastElement = list.get(list.size() -1);
            list.set(index,lastElement);
            map.put(lastElement , index);

            list.remove(list.size() -1);// to remove the element index from arraylest
            map.remove(val);// to remove the index of map otherwise will give true all the time
        }
        return isExists;
    }
    
    public int getRandom() {
        int randIndex = random.nextInt(list.size());
        return list.get(randIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */