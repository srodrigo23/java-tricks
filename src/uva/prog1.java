package mbp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class JLayerPlayer {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String [] links = {
        "https://dl.dropboxusercontent.com/apitl/1/AAD_7t4gXb3lvryhbsAvc7l3OVSYqmVY-PRt6BQpARQMkMmhdTX48jMCDZ6xXC8e7uNbf5PQqUIP02M1rRqf_RRdIlozu0H7BRQn0luiu14SIEcCGUnUoW7GNX1sDPF7nVo0RFuSaaezWGdGY6hCe2aHqW_AYaR0FAO27QWeKapwEQMGRCkTvdkVaN4Zinr_78qq__pc6N30kGqCrn7A8LWn-79Q9cOA3FECWVTb7D26_RH10Hku9UFK6bpaw9TdvOvmLXhwKfRl4iwCkdbRDqaKGNwKm2-n9dZ_E_rtz54aYA",
"https://dl.dropboxusercontent.com/apitl/1/AADPzjcIeJW6VnFTygBdU_591E_fXQDprfnYPKNGM3bKtPOOP7JqqplVDepShBW_lZR5W_2dm7ebaDvTN6B3Gss8rPRcdPYaVMPi5ipcRiczQokT7cme18wKMWw-ZiBV1B-4MI6noyq3rEyKb4SJj4C5eFqnL9cG52bxWCLTZV-u4ErmZl0EyBbUU267yIqEhgDOgbmMA1jAz0yGNaUzmwwj6QVphkutETpLjgwWNj0lQrIQyfvtYAR7v7FjngI_-LpgpY4zSDNkZLLYjP3cgWfn",
"https://dl.dropboxusercontent.com/apitl/1/AACT7etgw0_m7Ttgr1nV47lumcH3LWCzkpmG2CwCmcPreF-Jeno7aCLHdeCz8-uscxwe-Q0_MmLp6kZ-PnSE7BpdBh9oZVw-xeogFtI2tSvwrFyvAnI4bT_n-gdDuWS2gZExnVil9sKzxXdNEMDYaWp8fdjqTThLVL1Mt9TEpGIxMePOGO8UzgKLkrmU7RsL6YUedC5pzqvhbUkkKjUd6--lTcgTjPhnRwhjZigOhZmakbnzg2ClvXJLTfEcf2fX2Aj1UEZ1RGVjIKWqB5RRT8Q7BYw9IxJ6QpUh8Bn7HVqtdg",
"https://dl.dropboxusercontent.com/apitl/1/AAB1lEF8U3FPawPLCW3mYtFDlvxFYsTno6wJhaTPkb-QBDLHJWmt_mubgaDL5i6QPeDJi-TkXfLyFuPYk-Vpk-JYiFge0Iclz4ju1H4trymIUadRMkl2t-Z5mD4StJ5MA-bmyH-18Qt0Xao9biUGK_CuDnroDAmuxAEjlkhPnGghdgIe2uEKIuPyZpFYMh3ADNi-kg2OL3D_VrfsR6VP6dLYjVS6TGOJFbBw1qwTj5UcbCHjk4KdS0kilwEc4Z8X8oOrgU8WYN1op0H-TuNFB_3UbGhBel2DMiPhpYgha58MBw",
"https://dl.dropboxusercontent.com/apitl/1/AADltsbHnwj1j93EhPctrQYSm0yhDJIaS7D2NAM76JhBHBA04PILZM0T3TzgFOVqKsAGv4W6RO48Wra5mo_vCE8aWhelcHXa0y7ZZUNYv2UCvyyRXT8NQfZPra2xLO7JEUbtCI8fqEdzrXf-z6FHsNWHeomDTPvcwaKr4D2QtE_6zyWHduqpBK0K34boVcx7bl9NTgHP0mi3HvJoAWWkhGbf_fM8bWaoYiiPmJOhtUXtAtYeN1f17GsO4x1bTb315FMhcF_R7jTq3vzXZGNTCaOs-4Qel3dutMXpuImGlAo26A",
"https://dl.dropboxusercontent.com/apitl/1/AADqa1whYBWoIXBqhB2TY2ky_WTA84Mux3I1lldmcyiR-t6-s5dFwtU-OuFgxjb5L2qQJ36R8z2obNpZ3DzvXnypt8UQyMByY9Y0SRrHG5iYUywMkBe3_c2eAaeytQ-dd__qZGxHeTY5cbbqhe7Kv8rxK0WN9uALbz032qNELQhaD7UD9HPgboHFvyc9Xu28Alt5blUVJjcuQA877FDQ6A2dLeteYaoqO5dIVxjh7IOmkauYqK3BKlmSPGwVxoU949rWJJUktVvO1bZPCcHi-9xX",
"https://dl.dropboxusercontent.com/apitl/1/AABixJWOqyAuBUtTMaokkIJtfsIuG9_22fSycdS7SvjeVU9UEsv1UgKQG1CDHvaFvhlIak9iDdnfKbIGSqV024n_lCObiMsJ2N3II6HtTP2dIncmzjdjAF9WKVovZeTmnaSkYvTGAalqomJQMVwTd4wEI5sqpiyefYnrYIHtn6Uis8ugxFBf-r8kx-kd79SeI5uvvw7cDji85JCn8OwZLwEFGv1ykke6LSyMFZEKqqluWqQvh5L9vvSm1CBX1M1pDFCZDHJgCBZEnsXQfaGA8DuBiEpU846lGTD9QTuf2jISNs_j6QbaYi6vOI0EpsFNUAs",
"https://dl.dropboxusercontent.com/apitl/1/AAAs3RYs8iLOhipJMntDuYbOw6Huc_aj-z5ecp0ataJM9WDnRgBkmuSU-VmK9r_pQ-ycIFztTZ5PAl5f7ZILnnBplAF7MRqQ7NcHxWK-SHtHI5JPxjG24PlEE70bgF2IfHjvgraRuE8DaIBKsCjFULTp1k5glVK6yA0U8bsfdkGQxgqCi2Yyx44TaAVV4kyK7wOse_r47VjGt68qPuNf_0k2SfWt9jQfwwQuhGJyP6ty2ryoeZ-lWHk4J-SQDPj-YEvvBwVvoJE_bVz7Ga8zh8GSb9WNkRYr33LjYyoBlTsi-w",
"https://dl.dropboxusercontent.com/apitl/1/AAB8DNoUd0ZCTrwNRc5wr7FII_kw72SAhASGUjZS4IYJenC34p4vwglPhESzwGzuae-JnJZW_1aCEEx90dZACzPPVy7DXXYZO4o0PkwHU7YqfTjBNeYKF4TZ05O_eqXseISQ7GywoOgcwaB2olfhYc9uweIeRFYWc_hW6c5Yzy66jVvqCA-WnUrTmJtFFgVPAZK0G8UtK4MhYhqPknYaMSDbkfMfBfqjaDd6KByX4nq5huEAASXSDtF-Ore8D-OOFxc3p8DOkVzx4KLBkQeXZ2bxsQzYe1sc8K8B653WgJHWl97K_QAPmawEqT8ZLd2KK1s",
"https://dl.dropboxusercontent.com/apitl/1/AADoIOnLDZDL5lJVS-jZhAgtWTl7_zkZHujzVgHA4u1RgSCufUMEg6yoFgLfXu-9lKUNbXKrvt4jWqpSjXl8h8qnm-o2EoFrpknLdfpe9diRbAweXJSd78VcNcaEd9ivTDQr4ddyIfZb8SqcYQgCoMtC5bhoVpxFykWbW4tT2OIOLUDlAko9dst6HuNPPy63Uin5B6Z4C7LEklrr7DETSnH8YqEuFWlnapw49ZBHkxLdpfcuXyCesw0PO9OXqb4dcgZmBWe1Q0MCA2m_vsxQZxupD3X9hRX3dBntGPfYlnnAMRn_ZscKrKwfsWmmFACoGi4",
"https://dl.dropboxusercontent.com/apitl/1/AAAN3fcJqdCQUfRgmcFSrWtFmkt0eJpSZFOUMfiTOHzysdxMrQF2SnTBp9obPaiaq8oRo_tc76cwJGqHywrlzqCsOvdlgX4jXSWyhjjuvvgi1qqqhZETNeGrbLrzxkFR28HXR4FyzurhxW2tkIiamU5RtRYGGyjGT92Vf7QCtvmkg89W9dhIbM4v5GQZ4MEC16VAkFEPzv9ECMFnl-2OnwlQnGmW7QTlwJCFeN_jjFyWnspjNjOupJiSS9JYTB9htE5kSxTRHabcL-fKcN2zJkm19loYoPZ6UiqyDidnRoKWIg",
"https://dl.dropboxusercontent.com/apitl/1/AAAnGPDbopgk190Ni-cAXSAaWt9Smn3MCCKAppXMqaYd0AAPNRyITxXyNn7S7KZ93VCPAwB4paPSLsjiBnWMZteFJsR62m7-9-9Zu1Bx_HbOqfg1WNVUflrPMP3R_yWVw0f57KDfKoZ7jS5nDKvU-8zFzGNvQjKE4QwhLxKG8y9OXUdVuFAclWd4CHynWKsC-e60wXXEYzv_7RmLAPJjNoNPF2g691KJHVXuDNj1Y7ihCFvm1SN3NVTAUSKdgvneoSIDfUEd4aRi1k_S9ECV1_5LUmDm1tFfaK2PgyegOfnn2agrzbPinsW-cML3bwyLxNXbGR8fR_f8fTSeur3QtP_E"};
  
        try {
            for(int i=5; i<links.length; i++){
                URL oracle = new URL(links[i]);
                InputStream asi = oracle.openStream();
                Player player;
                player = new Player(asi); 
                player.play();          
            }            
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}