
public class Member {
    
    private String nama;
    private String team;
    private int umur;
    private double nPenampilan;
    private double nSuara;
    private double nAttitude;
    private double nilai;
    
    public void setNama(String n){
        nama = n;
    }
    public String getNama(){
        return nama;
    }
    public void setTeam(String t){
        team = t;
    }
    public String getTeam(){
        return team;
    }
    public void setUmur(int u){
        umur = u;
    }
    public int getUmur(){
        return umur;
    }
    public void setPenampilan(double p){
        nPenampilan = p;
    }
    public double getPenampilan(){
        return nPenampilan;
    }
    public void setSuara(double s){
        nSuara = s;
    }
    public double getSuara(){
        return nSuara;
    }
    public void setAttitude(double a){
        nAttitude =a;
    }
    public double getAttitude(){
        return nAttitude;
    }
    public double getNilai(){
        nilai = (nSuara + nAttitude + nPenampilan)/3;
        return nilai;
    }    
}
