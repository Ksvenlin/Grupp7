package model.Maps;

public class World3Maps extends WorldMaps{

    /**
     * @author André Eklund, Sebastian Helin, Viktor Näslund, Filip Örnling
     */

    private int[][] level1 = {{0, 4, 1, 1, 1, 1, 1, 1,1,1,4,3},
                               {0, 1, 0, 0, 0, 0, 0, 0,0,0,0,0},
                               {0, 1, 0, 1, 1, 1, 4, 0,0,0,0,0},
                               {4, 1, 1, 1, 0, 0, 1, 1,0,0,0,0},
                               {0, 0, 0, 0, 0, 7, 0, 1,0,0,0,0},
                               {1, 1, 1, 4, 0, 1, 0, 1,0,1,1,1},
                               {4, 0, 0, 1, 0, 1, 0, 1,1,1,0,1},
                               {1, 0, 0, 1, 1, 4, 1, 0,0,1,0,1},
                               {1, 0, 0, 1, 0, 0, 1, 0,1,1,1,1},
                               {1, 1, 0, 1, 0, 0, 1, 0,1,0,1,0},
                               {0, 1, 0, 4, 0, 0, 1, 0,1,0,4,0},
                               {2, 1, 4, 1, 1, 1, 1, 1,1,0,1,0},};

    private int[][] level2 = {{1, 1, 1, 1, 1, 1, 1, 4,1,1,1,2},
                               {1, 0, 0, 0, 0, 4, 0, 0,0,0,0,0},
                               {1, 1, 1, 1, 1, 1, 1, 1,1,0,0,0},
                               {1, 0, 0, 0, 0, 1, 0, 0,1,0,0,0},
                               {1, 0, 0, 0, 1, 1, 0, 0,6,0,0,0},
                               {1, 0, 0, 0, 1, 0, 0, 0,1,1,1,0},
                               {1, 0, 1, 1, 1, 1, 1, 1,0,0,1,0},
                               {1, 0, 1, 0, 0, 0, 0, 1,0,1,1,0},
                               {1, 0, 1, 0, 0, 0, 0, 1,0,1,0,0},
                               {1, 0, 1, 1, 1, 1, 1, 1,0,1,1,1},
                               {1, 0, 0, 0, 0, 0, 1, 0,0,0,0,1},
                               {5, 0, 0, 0, 0, 0, 1, 1,1,1,4,3},};

    private int[][] level3 = {{0, 0, 0, 0, 0, 0, 0, 0,0,0,1,3},
                               {0, 0, 0, 0, 0, 0, 0, 0,0,0,1,0},
                               {0, 0, 0, 4, 0, 1, 0, 4,0,0,1,0},
                               {1, 1, 1, 1, 1, 1, 1, 1,1,1,1,0},
                               {1, 0, 0, 1, 0, 4, 0, 1,0,0,0,0},
                               {1, 0, 0, 0, 0, 0, 0, 0,0,0,0,0},
                               {4, 1, 1, 1, 0, 0, 0, 0,0,0,0,0},
                               {1, 0, 0, 1, 1, 1, 4, 1,1,1,1,0},
                               {1, 1, 1, 1, 0, 0, 1, 1,0,0,1,0},
                               {0, 0, 0, 4, 1, 1, 1, 1,1,1,1,1},
                               {0, 0, 0, 0, 0, 0, 0, 0,0,0,0,1},
                               {0, 0, 0, 0, 0, 0, 0, 0,0,0,0,2},};

    private int[][] level4 =   {{0, 0, 0, 0, 0, 1, 1, 1,1,1,1,2},
                                {0, 1, 1, 1, 0, 4, 0, 0,0,0,0,0},
                                {1, 7, 0, 1, 0, 1, 0, 0,0,0,0,0},
                                {1, 0, 0, 1, 0, 1, 0, 0,0,0,0,0},
                                {1, 1, 0, 1, 0, 1, 0, 0,0,0,0,0},
                                {0, 1, 0, 1, 0, 1, 0, 0,0,0,0,0},
                                {1, 1, 0, 1, 1, 4, 0, 0,0,0,0,0},
                                {1, 0, 0, 0, 0, 0, 0, 0,0,0,0,0},
                                {1, 1, 1, 1, 1, 0, 0, 0,0,0,0,0},
                                {0, 1, 1, 1, 1, 1, 4, 1,1,1,0,0},
                                {0, 0, 1, 1, 1, 1, 1, 1,1,1,1,1},
                                {0, 0, 1, 1, 1, 1, 1, 4,1,1,7,3},};

    private int[][] level5 =   {{1, 1, 1, 4, 1, 1, 1, 4,1,1,1,3},
                                {6, 0, 0, 0, 0, 0, 0, 0,1,0,0,0},
                                {1, 1, 1, 1, 1, 1, 1, 1,1,0,0,0},
                                {1, 0, 1, 1, 1, 1, 1, 1,1,0,0,0},
                                {1, 0, 0, 0, 0, 0, 0, 0,0,0,0,0},
                                {4, 0, 0, 5, 0, 0, 0, 1,4,1,1,4},
                                {1, 0, 1, 1, 1, 1, 1, 1,0,0,0,1},
                                {1, 0, 1, 0, 1, 0, 0, 1,1,1,1,1},
                                {4, 0, 1, 0, 1, 0, 0, 0,0,4,0,0},
                                {1, 0, 1, 1, 1, 0, 0, 1,1,1,1,1},
                                {1, 0, 0, 1, 0, 0, 0, 1,0,0,0,1},
                                {1, 1, 1, 1, 0, 0, 0, 1,1,1,1,2},};

    public World3Maps(int world) {
        super(world);
    }


    /**
     * Returnerar en array som representerar en nivå i spelet.
     * @return returnerar en array av siffror.
     */
    @Override
    public int[][] getLevel1(){
        return level1;
    }
    @Override
    public int[][] getLevel2(){
        return level2;
    }
    @Override
    public int[][] getLevel3(){
        return level3;
    }
    @Override
    public int[][] getLevel4(){
        return level4;
    }
    @Override
    public int[][] getLevel5() {
        return level5;
    }
}
