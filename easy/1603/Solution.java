class ParkingSystem {
	/*
	执行用时：8 ms, 在所有 Java 提交中击败了98.81%的用户
	内存消耗：38.7 MB, 在所有 Java 提交中击败了95.47%的用户
	*/
    int big,bigUsed;
    int medium,mediumUsed;
    int small,smallUsed;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.bigUsed=0;
        this.medium=medium;
        this.mediumUsed=0;
        this.small=small;
        this.smallUsed=0;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(bigUsed<big){
                bigUsed++;
                return true;
            }
        }else if(carType==2){
            if(mediumUsed<medium){
                mediumUsed++;
                return true;
            }
        }else{
            if(smallUsed<small){
                smallUsed++;
                return true;
            }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */