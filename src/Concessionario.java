import java.util.Arrays;

public class Concessionario
{
    private Veicolo concessionario[];

    public Concessionario()
    {
        concessionario = new Veicolo[1000];
    }

    public String aggiungiVeicolo(Veicolo v1)
    {
        int i=0;
        for(i=0; i<1000; i++)
        {
            if(concessionario[i]==null)
            {
                concessionario[i]=v1;
                return "Auto parcheggiata!";
            }
        }
        return "Il parcheggio è pieno!";
    }

    public String rimuoviVeicolo(int codice, String targa)
    {
        int i=0;
        for(i=0; i<1000; i++)
        {
            if(codice==concessionario[i].getCodice() && targa==concessionario[i].getTarga())
            {
                concessionario[i]=null;
                return "L'auto con codice: "+codice+" e targa: "+targa+" è stata rimossa!";
            }
        }
        return "Nessuna auto con i parametri inseriti è stata trovata!";
    }

    public String ricercaVeicolo(int codice, String targa)
    {
        int i=0;
        for(i=0; i<1000; i++)
        {
            if(codice==concessionario[i].getCodice() && targa==concessionario[i].getTarga())
            {
                return "AUTO TROVATA: \n" + concessionario[i].toString();
            }
        }
        return "Nessuna auto con i parametri inseriti è stata trovata!";
    }

    public String ricercaVeicoloNPosti(int posti)
    {
        int i=0;
        for(i=0; i<1000; i++)
        {
            if(posti==concessionario[i].getNumPosti())
            {
                return "AUTO TROVATA: \n" + concessionario[i].toString();
            }
        }
        return "Nessuna auto con i parametri inseriti è stata trovata!";
    }

    public void inventario()
    {
        Arrays.sort(concessionario);
    }

    public void stampa()
    {
        int i=0;
        for(i=0; i<1000; i++)
        {
            if(concessionario[i]!=null)
            {
                System.out.println(concessionario[i].toString());
            }
        }
    }

}
