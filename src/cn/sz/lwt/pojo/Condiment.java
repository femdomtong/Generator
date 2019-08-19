package cn.sz.lwt.pojo;

public class Condiment {
    private Integer cid;

    private String ccondiment;

    private String cproduct;

    private Double cspecifications;

    private Integer cinterval;

    private String cwave;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCcondiment() {
        return ccondiment;
    }

    public void setCcondiment(String ccondiment) {
        this.ccondiment = ccondiment == null ? null : ccondiment.trim();
    }

    public String getCproduct() {
        return cproduct;
    }

    public void setCproduct(String cproduct) {
        this.cproduct = cproduct == null ? null : cproduct.trim();
    }

    public Double getCspecifications() {
        return cspecifications;
    }

    public void setCspecifications(Double cspecifications) {
        this.cspecifications = cspecifications;
    }

    public Integer getCinterval() {
        return cinterval;
    }

    public void setCinterval(Integer cinterval) {
        this.cinterval = cinterval;
    }

    public String getCwave() {
        return cwave;
    }

    public void setCwave(String cwave) {
        this.cwave = cwave == null ? null : cwave.trim();
    }
}