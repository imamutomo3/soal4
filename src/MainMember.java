
import java.util.ArrayList;
public class MainMember {
    public static void main(String[] args) {
        ArrayList<Member>idol = new ArrayList <>();
        
        Member idol1 = new Member();
        Member idol2 = new Member();
        Member idol3 = new Member();
        
        idol1.setNama("Xenovia");
        idol1.setTeam("1");
        idol1.setUmur(19);
        idol1.setPenampilan(90);
        idol1.setSuara(95);
        idol1.setAttitude(85);
        
        idol2.setNama("Marsacanita");
        idol2.setTeam("2");
        idol2.setUmur(20);
        idol2.setPenampilan(95);
        idol2.setSuara(75);
        idol2.setAttitude(85);
        
        idol3.setNama("Sinthaa");
        idol3.setTeam("3");
        idol3.setUmur(18);
        idol3.setPenampilan(80);
        idol3.setSuara(95);
        idol3.setAttitude(80);
        
        idol.add(idol1);
        idol.add(idol2);
        idol.add(idol3);
        
        System.out.println("Penilaian member baru Idol");
        for (int i=0 ; i < idol.size(); i++){
            System.out.println("Nama \t : "+idol.get(i).getNama());
            System.out.println("Team \t : "+idol.get(i).getTeam());
            System.out.println("Umur \t : "+idol.get(i).getUmur());
            System.out.println("Nilai \t : "+idol.get(i).getNilai());
            System.out.println("\n====================================");
        }
    }
    
}
