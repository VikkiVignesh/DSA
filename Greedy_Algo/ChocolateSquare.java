
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ChocolateSquare {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer Hcut[]={4,1,2};
        Integer Vcut[]={2,1,3,1,4};

        Arrays.sort(Vcut,Collections.reverseOrder());
        Arrays.sort(Hcut,Collections.reverseOrder());
        int h=0,v=0;
        int hc=1,vc=1;
        int cost=0;
        while (h<Hcut.length && v<Vcut.length) {
            if(Hcut[h]>= Vcut[v])
            {
              cost+=(Hcut[h]*vc);
              hc++;
              h++;
            }
            else
            {
              cost+=(Vcut[v]*hc);
              vc++;
              v++;
            }
        }
        while (h<Hcut.length) {
            cost+=(Hcut[h]*vc);
            hc++;
            h++;
        }
        while (v<Vcut.length) {
            cost+=(Vcut[v]*hc);
            vc++;
            v++;
        }

        System.out.println("Min Cost for Cutting Chocolate is : "+cost );
    }
}
