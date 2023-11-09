public enum ElecCompany {

    NORTHCAIRO,SOUTHCAIRO,DELTA,SUEZCANNAL;
    public static ElecCompany fromString(String text) {
        for (ElecCompany company : ElecCompany.values()) {
            if (company.name().equalsIgnoreCase(text)) {
                return company;
            }
        }
        return null;
    }
}
