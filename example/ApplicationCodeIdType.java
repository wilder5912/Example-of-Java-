public enum ApplicationCodeIdType {

    SOLE_PROPRIETOR_PHYSICIAN_SURGEON("21","ISP_P_DM","Individual"),
    RENDERING_PHYSICIAN_SURGEON("22","ISP_RP_P_DM", "Individual"),
    PHYSICIAN_SURGEON_GROUP("23","GSP_P_DM","Organization"),
    RENDERING_ALLIED("24","ISP_RP_U_RA","Individual"),
    RENDERING_MIDLEVEL("25","ISP_RP_S_RM","Individual"),
    SOLE_PROPRIETOR_ALLIED("26","ISP_NP_AP","Individual"),
    HEATH_CARE_GROUP_PRACTICE("28","GSP_AL_BL", "Organization"),
    RENDERING_S_PHYSICIAN_SURGEON("34","ISP_RS_P_DM","Individual"),
    RENDERING_S_ALLIED("35","ISP_RS_U_RA","Individual"),
    RENDERING_S_MIDLEVEL("36","ISP_RS_S_RM","Individual"),
    INCORPORATED_PHYSICIAN_SURGEON("37","IGSP_P_DM", "Organization"),
    INCORPORATED_ALLIED("38","IGSP_NP_AP", "Organization"),
    GROUP_SOLE_PROPIETOR_ALLIED("39","GISP_NP_AP", "Individual"),
    ORP("40","ISP_P_ORP", "Individual"),
    GROUP_SOLE_PROPIETOR_PHYSICIAN_SURGEON("41","GISP_P_DM",  "Individual");



    private String id;
    private String code;
    private String npiType;

   ApplicationCodeIdType(String id, String code, String npiType) {
        this.id = id;
        this.code = code;
        this.npiType = npiType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNpiType() {
        return npiType;
    }

    public void setNpiType(String npiType) {
        this.npiType = npiType;
    }
}
