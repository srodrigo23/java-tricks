
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.GetTemporaryLinkResult;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodrigo
 */
public class Conection {
    
    private final DbxRequestConfig config;
    private final String token;
    
    private DbxClientV2 client;
    
    Conection(){
        config  = new DbxRequestConfig("mbp", Locale.getDefault().toString());
        token = "G1IxlFL41tAAAAAAAAABpAZ_2O29pQ_CdLNx2ni0j6cdbbX7ivyK4rmwzLKXnDxS";
        client = new DbxClientV2(config, token);
        
    }
    
    private FullAccount getAccount() throws DbxException{
        return client.users().getCurrentAccount();
    }
    
    public void mostrarInfoAccount() throws DbxException{
        FullAccount fa = getAccount();
        System.out.println(fa.getName().getDisplayName());
        System.out.println(fa.getAccountType().toString());
        System.out.println(fa.getCountry());
        System.out.println(fa.getEmail());
    }
    
    private ListFolderResult getFolderResult(String path){
        try {
            return client.files().listFolder(path);
        } catch (DbxException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private GetTemporaryLinkResult getTemporalLink(String path) throws DbxException{
        return client.files().getTemporaryLink(path);
    }
    
    public void mostrarContenido(String path) throws DbxException{
        List<Metadata> dir = getFolderResult(path).getEntries();
        String link;
        for (Iterator<Metadata> iterator = dir.iterator(); iterator.hasNext();) {
            Metadata next = iterator.next();
            System.out.println(getTemporalLink(next.getPathLower()).getLink());
            if(isFolder(next.toString()))
                mostrarContenido(next.getPathLower());
        }
    }
    
    private boolean isFolder(String desc){
        return desc.contains(".tag\":\"folder");
    }
    
    
    public static void main(String[] args) throws DbxException {
        new Conection().mostrarContenido("/music");
    }
}
