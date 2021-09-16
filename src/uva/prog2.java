import com.dropbox.core.*;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.GetTemporaryLinkResult;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;
import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Coneccion {
    
    public static void main(String[] args) throws IOException, DbxException {
        // Get your app key and secret from the Dropbox developers website.
        //final String APP_KEY = "05zhrpmla4mtawa";
        //final String APP_SECRET = "e1eyho4rj6oel44";
        //DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
        DbxRequestConfig config = new DbxRequestConfig("JavaTutorial/1.0",
            Locale.getDefault().toString());
        //DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
        // Have the user sign in and authorize your app.
        //String authorizeUrl = webAuth.start();
        //System.out.println("1. Go to: " + authorizeUrl);
        //System.out.println("2. Click \"Allow\" (you might have to log in first)");
        //System.out.println("3. Copy the authorization code.");
        //String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        // This will fail if the user enters an invalid authorization code.
        //DbxAuthFinish authFinish = webAuth.finish(code);
        String accessToken = "G1IxlFL41tAAAAAAAAABpAZ_2O29pQ_CdLNx2ni0j6cdbbX7ivyK4rmwzLKXnDxS";
        //String accessToken = authFinish.getAccessToken();
        //System.out.println(accessToken);
        
        DbxClientV2 client = new DbxClientV2(config, accessToken);
        FullAccount account = client.users().getCurrentAccount();
        
        System.out.println(account.getName().getDisplayName());
        
        String folder = "/music";
        
        ListFolderResult result = client.files().listFolder(folder);
        
        List<Metadata> content = result.getEntries();
        Iterator it = content.iterator();
        Metadata met;
        GetTemporaryLinkResult link;
        
        while(it.hasNext()){
            met = (Metadata)it.next();
            link = client.files().getTemporaryLink(met.getPathLower());
            //System.out.println(met.getPathLower());
            System.out.println("\"" + link.getLink()+ "\",");
        }
        //while (true) {   
        //    for (Metadata metadata : result.getEntries()) {
        //        System.out.println(metadata.getPathLower());
        //    }
         //   if (!result.getHasMore()) {
         //       break;
        //    }
            //result = client.files().listFolderContinue(result.getCursor());
        //}
        
//        File inputFile = new File("working-draft.txt");
//        FileInputStream inputStream = new FileInputStream(inputFile);
//        try {
//            DbxEntry.File uploadedFile = client.uploadFile("/magnum-opus.txt",
//                DbxWriteMode.add(), inputFile.length(), inputStream);
//            System.out.println("Uploaded: " + uploadedFile.toString());
//        } finally {
//            inputStream.close();
//        }
//
//        DbxEntry.WithChildren listing = client.getMetadataWithChildren("/");
//        System.out.println("Files in the root path:");
//        for (DbxEntry child : listing.children) {
//            System.out.println("	" + child.name + ": " + child.toString());
//        }
//
//        FileOutputStream outputStream = new FileOutputStream("magnum-opus.txt");
//        try {
//            DbxEntry.File downloadedFile = client.getFile("/magnum-opus.txt", null,
//                outputStream);
//            System.out.println("Metadata: " + downloadedFile.toString());
//        } finally {
//            outputStream.close();
//        }
    }
}