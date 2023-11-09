public enum WaterCompany {
    CAIROWATER ,ALEXWATER;
    public static WaterCompany fromString(String text) {
        for (WaterCompany company : WaterCompany.values()) {
            if (company.name().equalsIgnoreCase(text)) {
                return company;
            }
        }
        return null;
    }


};
