public enum GazCompany {
    TAQA,PETROID,NATGAZ;
    public static GazCompany fromString(String text) {
        for (GazCompany company : GazCompany.values()) {
            if (company.name().equalsIgnoreCase(text)) {
                return company;
            }
        }
        return null;
    }

};
