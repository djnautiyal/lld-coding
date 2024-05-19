package com.learn.design_patterns.behavioural.memento.storing_star_details;

interface StarMemento {
}

public class Star {
    private int ageInBillions;
    private StarType starType;
    private int massInSuns;

    public Star(int age, StarType starType, int massInSuns) {
        this.ageInBillions = age;
        this.starType = starType;
        this.massInSuns = massInSuns;
    }

    public void timePasses(){
        ageInBillions += 2;
        massInSuns *= 100;

        switch (starType){
            case SUN:
                starType = StarType.RED_GIANT;
                break;
            case RED_GIANT:
                starType = StarType.WHITE_DWARF;
                break;
            case WHITE_DWARF:
                starType = StarType.SUPERNOVA;
                break;
            case SUPERNOVA:
                starType = StarType.DEAD_STAR;
                break;
            case DEAD_STAR:
                ageInBillions += 2;
                massInSuns = 0;
                break;
        }
    }

    StarMemento getMemento(){
        var memento = new StarMementoImpl(ageInBillions, starType, massInSuns);
        return memento;
    }

    void setMemento(StarMemento memento){
        var starMementoImpl = (StarMementoImpl) memento;
        this.ageInBillions = starMementoImpl.getAgeInBillions();
        this.starType = starMementoImpl.getStarType();
        this.massInSuns = starMementoImpl.getMassInSuns();
    }

    @Override
    public String toString() {
        return "Star [ageInBillions=" + ageInBillions + ", starType=" + starType + ", massInSuns=" + massInSuns + "]";
    }

    private static class StarMementoImpl implements StarMemento{
        private int ageInBillions;
        private StarType starType;
        private int massInSuns;

        public StarMementoImpl(int age, StarType starType, int massTons) {
            this.ageInBillions = age;
            this.starType = starType;
            this.massInSuns = massTons;
        }

        public int getAgeInBillions() {
            return ageInBillions;
        }

        public StarType getStarType() {
            return starType;
        }

        public int getMassInSuns() {
            return massInSuns;
        }
    }
}
