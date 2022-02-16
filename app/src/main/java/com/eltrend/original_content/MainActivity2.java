package com.eltrend.original_content;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.eltrend.original_content.R;
import com.eltrend.original_content.RecyclerViewAdapter;
import com.eltrend.original_content.customItems;

import java.util.ArrayList;
import java.util.List;


public class MainActivity2 extends AppCompatActivity {

    List<customItems> itemsList;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        itemsList = new ArrayList<>();
        itemsList.add(new customItems("https://scontent-mrs2-2.xx.fbcdn.net/v/t1.0-9/117373876_3279475345476471_8015763472630573358_n.jpg?_nc_cat=106&_nc_sid=825194&_nc_eui2=AeFqmR5u5prREyNW016XBAnZKIiD1yn_TYwoiIPXKf9NjDygIc4-_QPbhAn3wK5YMEHaorjckBb2UAxkh4L43BNV&_nc_ohc=1SGse9-IjWwAX8VJno2&_nc_ht=scontent-mrs2-2.xx&oh=d6b98c1a532b9812d2e1925b253ebd84&oe=5F5E036F"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/p370x247/116338127_2755232514707773_7049197077745298309_o.jpg?_nc_cat=110&_nc_sid=825194&_nc_eui2=AeHleicsGymW_TE1NM2ApzhUi_cbsxjXPjmL9xuzGNc-OUvE8a5kT7kBQH_r21RL3nLLf-YkEm5v0M3LIc1bsfhS&_nc_ohc=5El3Wiego6UAX9VgCBJ&_nc_ht=scontent-mrs2-1.xx&_nc_tp=6&oh=d1fa31bc1082b1aed743f23e765a715c&oe=5F5DA5D1"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-0/p350x350/117901859_3202291236529943_1594913028969999059_o.jpg?_nc_cat=102&_nc_sid=b9115d&_nc_eui2=AeETzIh9ahf6_2DYE9BvXVwCK7aCMwNIa5IrtoIzA0hrkp4ChAjo4A6Jh5MOYJU5sjAI2LInebn2kFYmR-MFFYi4&_nc_ohc=8kU2ZdzQFcsAX8ztPK7&_nc_ht=scontent.fcai19-1.fna&_nc_tp=6&oh=867427523aa66f93ddb0f76339e0375f&oe=5F5F98E1"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-0/p480x480/110145733_594037597967637_6244574329655950431_o.jpg?_nc_cat=101&_nc_sid=b9115d&_nc_eui2=AeExuL02wAb_SXQN4hHhywIKDcQNXzWCmxMNxA1fNYKbE0I0_Wp2xzkHVMrTQViThQUfGV93kwXuRMMy4xxLkXC7&_nc_ohc=PvYmcN3z58IAX9XLSfr&_nc_ht=scontent.fcai19-1.fna&_nc_tp=6&oh=25ff1bd334ab1885155dc3b1c1029d5a&oe=5F5C0315"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-0/p320x320/112624262_288282625929915_5373088196804481480_o.jpg?_nc_cat=101&_nc_sid=825194&_nc_eui2=AeE8UGzunkS0RPxsc_tkhAo_QIioab3R6OZAiKhpvdHo5rMyk-pNxgSpielRB0xIwFY4dy40ZWJgE2Z-HN2L5nDO&_nc_ohc=1VMuuL7Z0IEAX_Kvm2E&_nc_ht=scontent.fcai19-1.fna&_nc_tp=6&oh=cb59e265fe3645d48657fb022eb231e4&oe=5F5CF172"));
        itemsList.add(new customItems("https://scontent-mrs2-2.xx.fbcdn.net/v/t1.0-0/p480x480/110283151_1413389922384199_5883739404327893280_n.jpg?_nc_cat=107&_nc_sid=825194&_nc_eui2=AeH7MFWgSOAWvs05OadsqHV_665FCTW4elHrrkUJNbh6UXAAIM_37N3Ad9MRG3YctHGxJhKEopaM64dR4WlMX4Fk&_nc_ohc=tkfaoscI8mMAX9p7OvV&_nc_ht=scontent-mrs2-2.xx&_nc_tp=6&oh=1396569a364c30ab2899d9b3af35a0ca&oe=5F5F75DC"));
        itemsList.add(new customItems("https://scontent-mrs2-2.xx.fbcdn.net/v/t1.0-0/p480x480/109499554_2727287517543346_4617673984337035605_n.jpg?_nc_cat=107&_nc_sid=825194&_nc_eui2=AeEew1wLB92JGLwK0RedVA1nH-sUjMxj0Dgf6xSMzGPQOCBKWSZ3MlXLoSBUmWBhoO-HHB7oDnG-Ow6gxOuJLcej&_nc_ohc=-iqy80fJ4qEAX_02lin&_nc_ht=scontent-mrs2-2.xx&_nc_tp=6&oh=630dbdfaaa61441219372e801169d072&oe=5F5E8746"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/s480x480/112701177_1488555978022221_3278307153311213270_n.jpg?_nc_cat=104&_nc_sid=b9115d&_nc_eui2=AeHMGOXyGUPdlTtbVYuJ_3Ny0siEs-NVFQHSyISz41UVAZzM2hbKDx-ZnkQMsbrsxOLigV_yedG2t28Fr3nqu3jd&_nc_ohc=5TN12TGSgp4AX-6yxd1&_nc_ht=scontent-mrs2-1.xx&_nc_tp=7&oh=2878b93bd76a048cd95341535acc29d7&oe=5F5C0450"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/p480x480/117584058_3926555127429102_7245120768870942986_o.jpg?_nc_cat=105&_nc_sid=825194&_nc_eui2=AeF7-4lF9WVjZgJbunUzfUtt_Ea1-E9ROtP8RrX4T1E60wbxLG0_HTESHpbUix15ENqPDlgzSC7GD8OhhPBCHX_1&_nc_ohc=QP_S1rJi3PsAX_lDTtY&_nc_ht=scontent-mrs2-1.xx&_nc_tp=6&oh=a9ce16770e1bdf9a0dec19ba54705152&oe=5F5DAC89"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-0/p480x480/110145733_594037597967637_6244574329655950431_o.jpg?_nc_cat=101&_nc_sid=b9115d&_nc_eui2=AeExuL02wAb_SXQN4hHhywIKDcQNXzWCmxMNxA1fNYKbE0I0_Wp2xzkHVMrTQViThQUfGV93kwXuRMMy4xxLkXC7&_nc_ohc=PvYmcN3z58IAX9XLSfr&_nc_ht=scontent.fcai19-1.fna&_nc_tp=6&oh=25ff1bd334ab1885155dc3b1c1029d5a&oe=5F5C0315"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/p75x225/110181852_2172101419602256_4313948714097538728_n.jpg?_nc_cat=110&_nc_sid=825194&_nc_eui2=AeG1fFtuXoc8x70G0OQ7_Rv2-czF7Ghfzxf5zMXsaF_PFyqTBcCczuEsBW0NhO8ZVS5UWDboANuHaCoKUzKz0gju&_nc_ohc=umzpwBZ8t5EAX_RWnOc&_nc_ht=scontent-mrs2-1.xx&_nc_tp=6&oh=cc86f123ca27d192b7fccf571727c1a4&oe=5F5D9DF3"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-0/p235x165/109838958_4110213802353675_8441701923513278590_o.jpg?_nc_cat=101&_nc_sid=825194&_nc_eui2=AeFIRbOkGjObTq_aDMP_b4V6hqxL7FZdoZKGrEvsVl2hkuf1jCmdBOqHN35FTZhrG9s6iDg7nAUcCU82hG3QOveR&_nc_ohc=SUIJS1qMqOMAX8qYOf6&_nc_ht=scontent.fcai19-1.fna&_nc_tp=6&oh=2ab763c60b28856112a3a9e787ed887a&oe=5F5D5E18"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/p320x320/117718100_304550490861358_8398773274984841462_o.jpg?_nc_cat=104&_nc_sid=b9115d&_nc_eui2=AeGudEakV_SHxoR9jXOOBPs9N7HVd8jNKT43sdV3yM0pPoopuV7-LH6q4G0lEdltw6oq3Fy4xSopPg7nQO1xd5Sr&_nc_ohc=JiHI09NO43kAX9mmi3D&_nc_ht=scontent-mrs2-1.xx&_nc_tp=6&oh=e78582eeb1acda4bf5b4ba306e384114&oe=5F5DC52B"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/117169441_155193066147015_8659189939825732560_n.jpg?_nc_cat=100&_nc_sid=dbeb18&_nc_eui2=AeEbjBw7GKFm75VLKFmToM8zKSjpgwdAUvgpKOmDB0BS-C4XSFBg_E2D8eqoqz8mquPhYdvtnjScQrYXq92HKaGW&_nc_ohc=fMEnuubbls8AX-MMbL4&_nc_ht=scontent.fcai19-1.fna&oh=4c0b4518e44cbdcdc2eca49b11c6c48c&oe=5F5C4EE8"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-0/p130x130/117304233_119853949821952_5517230188905291233_o.jpg?_nc_cat=101&_nc_sid=dbeb18&_nc_eui2=AeFXvdxBYnHvl8le9Xb4ZRG2NAwrDsckPw80DCsOxyQ_D2SYccv6YLscTh-y1xBVeB0foZ-aXNEMTbXVPQ9hJx_I&_nc_ohc=cjWNRpyXTlgAX_IrAyx&_nc_ht=scontent.fcai19-1.fna&_nc_tp=6&oh=b776829c76053475da280657b82a208c&oe=5F5C181F"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/s261x260/117429398_2655214824806821_9155206549605056909_n.jpg?_nc_cat=104&_nc_sid=dbeb18&_nc_eui2=AeFQNG8wffcJsSxwH2H7JCzvqgT5LX4DYt6qBPktfgNi3kJyl2ozYezqjeQqnUdtrKUUrUHLfXCyRi9esrAgGQB9&_nc_ohc=7ev08Gs1fyQAX8IJ2q_&_nc_ht=scontent-mrs2-1.xx&_nc_tp=7&oh=4c2bdd1280e671a8160e406174ad2970&oe=5F5C8280"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/s261x260/117387309_2655215071473463_5576138938448499625_n.jpg?_nc_cat=109&_nc_sid=dbeb18&_nc_eui2=AeEQza1NwFaemPq5YyoVzYMeL4jZHNnV_zgviNkc2dX_OJpkPCyC1i8qywpcunVAJEvjO7smLneNbz-WVs1mB_Fa&_nc_ohc=SE6h9g5jDxcAX9rxJ3S&_nc_ht=scontent-mrs2-1.xx&_nc_tp=7&oh=ac9aea4475890f1d0ff79b390a39b773&oe=5F5F0949"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-0/s261x260/117565339_2655215238140113_6682627974285911877_n.jpg?_nc_cat=102&_nc_sid=dbeb18&_nc_eui2=AeFx9aQhQIP10HBAN38JUf4lbcmdFe2tU3VtyZ0V7a1Tdd83w5_RImo43Z-V94HWExv0lWaEdtWrE6l2I8AGEOU_&_nc_ohc=G82DfPLrpa8AX8m7clM&_nc_ht=scontent.fcai19-1.fna&_nc_tp=7&oh=89eb66c52794f6d79027ed3948ac616e&oe=5F5DA27E"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-9/113125821_970988616697758_2647739059923627_o.jpg?_nc_cat=109&_nc_sid=825194&_nc_eui2=AeHh2x44Br8coW4oe3kMFCkVq0xllbEGSEirTGWVsQZISPn1GWz1k5JusrukvNAfefxQIE4IhrA-tFR1-JFsCZJe&_nc_ohc=WvQlq5EkY9UAX9aLyd3&_nc_ht=scontent-mrs2-1.xx&oh=60990d790982637ae37c1762bc94273a&oe=5F5D6070"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/s526x296/117818129_304550480861359_3112560229374044723_o.jpg?_nc_cat=109&_nc_sid=b9115d&_nc_eui2=AeEdayt-WW9SJZA1po679ag112BN0Hm2igzXYE3QebaKDFGAysbDDIfRdan53QCtVvsER38q1-T8QPNUSe7Pvukm&_nc_ohc=Akj9bVVADp8AX8dbgch&_nc_ht=scontent-mrs2-1.xx&_nc_tp=7&oh=db34f0f4288353a01996b8c60cc8c06d&oe=5F5DBA46"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/p480x480/117795811_2746746922314514_6921004012780988169_n.jpg?_nc_cat=103&_nc_sid=b9115d&_nc_eui2=AeFTE6gTRwypq6uqjH5GNSYN4VhP3YCwgmXhWE_dgLCCZdY3t5-qs2ae3V3M3LH1H5E65ejSqgPKBOVY8D2aFVLA&_nc_ohc=hjRI0xBtuVkAX9Evu11&_nc_ht=scontent-mrs2-1.xx&_nc_tp=6&oh=25c7b88d78cffb892341e74f0635c47a&oe=5F5FA1E7"));
        itemsList.add(new customItems("https://scontent-mrs2-2.xx.fbcdn.net/v/t1.0-0/p480x480/117608601_2746746842314522_249941855405896982_n.jpg?_nc_cat=107&_nc_sid=b9115d&_nc_eui2=AeFiZTN1hy0QYAjNjvRPR3kKWkVXKrXrkKFaRVcqteuQoWTAHx-splBS4yPLi3nHhrTC7U7a0KLXxVCrkm-1FflM&_nc_ohc=R_MYvWFxfZQAX--gpl_&_nc_ht=scontent-mrs2-2.xx&_nc_tp=6&oh=9056d6a8b5df11e89c1c5e536cd31ab5&oe=5F5E12D1"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/109857157_3063574057023897_3987025071593228705_n.jpg?_nc_cat=105&_nc_sid=dbeb18&_nc_eui2=AeGezM10V0Ypx_RXpRIx3MDLq7z4LJ8b9MOrvPgsnxv0w3DjSOgWCuxM5ajyk7YR8DH0w2ALq0L4irBy6xxRxuck&_nc_ohc=O6zfaXQoeOYAX_sku6_&_nc_ht=scontent.fcai19-1.fna&oh=35146a3a0bd0bf89ac3bd457891688ff&oe=5F569A94"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/115752318_924401964706950_7601491036094112405_n.jpg?_nc_cat=102&_nc_sid=dbeb18&_nc_eui2=AeFyfRuhLmnaVTUAxZKhbIrs_XKqerYGgRb9cqp6tgaBFih1ooUH5lnxcgYWwbL9CdJIvCAvbm-wdAvuJ0UuJmak&_nc_ohc=MfBBwlEcB5MAX97rzZ-&_nc_ht=scontent.fcai19-1.fna&oh=1cf6735f96fed51c517841d790d74124&oe=5F5485A0"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/117311785_3914318628652752_1456016847011556775_o.jpg?_nc_cat=104&_nc_sid=825194&_nc_eui2=AeHDlypL2cUGM57NpBJDthi77FqhduLAEG3sWqF24sAQbYhVCJZXHqE6Kuxcw3U6fzDOXHYeXnV189AddXMb88c5&_nc_ohc=JKUJjKapKPwAX_zyQEF&_nc_ht=scontent.fcai19-1.fna&oh=5acd468130c896c26172ad1b6ec0fe4a&oe=5F56BEA9"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/117395233_310048773531408_6153697713672425647_n.jpg?_nc_cat=103&_nc_sid=825194&_nc_eui2=AeGYiO1yoRpYTYjJChjEdg0XqQvFtZlTHRSpC8W1mVMdFDCd_kknskyfTtR_9bdtXXn85QIBRD7nFBBiMdTKkH8o&_nc_ohc=Ggo1e9YUbUQAX-ikB0S&_nc_ht=scontent.fcai19-1.fna&oh=6f23d18a668cf47c13336a1b66dd71c0&oe=5F5745F9"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/117530318_309256816943937_2844964361459858686_n.jpg?_nc_cat=104&_nc_sid=825194&_nc_eui2=AeGaTTKPVoE2onhYcxr3IGbdDWuMny8Vr7gNa4yfLxWvuNpGJeg5IzSM2bQ-KKwtjUDG1jEHK9HKSCHyAFnXjJBZ&_nc_ohc=JpcdtR3h5DsAX-PcGAl&_nc_ht=scontent.fcai19-1.fna&oh=04334c8abdf4def6e3fe1c86607327cb&oe=5F558CC6"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/117034963_2356723224632421_6873076700440373068_n.jpg?_nc_cat=100&_nc_sid=825194&_nc_eui2=AeE6qr-74wxW-RjGlMs4OeclYyo0ldZ2cF5jKjSV1nZwXoQypfOEkYAqYcQl-512BuSggNDcgbJ12MpRwA510WaF&_nc_ohc=AEECsSatYTsAX_ve_QW&_nc_ht=scontent.fcai19-1.fna&oh=216c1e4e200e7288fb18cf96dc6bd121&oe=5F56D031"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/116355927_830748260793129_8464248050242203952_n.jpg?_nc_cat=104&_nc_sid=825194&_nc_eui2=AeH6Ld-A17ofGQRenjhdLmNiETcAE64_WXQRNwATrj9ZdFw82TsBq3H_zVswekJhKv1bypedL-3ySmQ7Mxg39bQW&_nc_ohc=EMCZ6Obiow4AX_E0trg&_nc_ht=scontent.fcai19-1.fna&oh=ee2416e223147a9ec4e2cad39a97d62e&oe=5F579C70"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/116287071_341443563685721_1528394099002692725_o.jpg?_nc_cat=104&_nc_sid=b9115d&_nc_eui2=AeHvOZfUT9wPP60vBBQZGZpsuCLjJJ0A-oS4IuMknQD6hGprHhLJDhWO1vSdLo9csmLKJkKoejDSQZsh9VAikNtR&_nc_ohc=hq7ew73gO8cAX_mC5J9&_nc_ht=scontent.fcai19-1.fna&oh=82129a216e97d3fd0a7239c592056311&oe=5F55B6EA"));
        itemsList.add(new customItems("https://scontent-hbe1-1.xx.fbcdn.net/v/t1.0-9/116429513_341443423685735_3442217382343544380_n.jpg?_nc_cat=111&_nc_sid=b9115d&_nc_eui2=AeGQXvhFc0jvF96a2KnWq1T5u8Vq12v8D-a7xWrXa_wP5lYriBAve2Go_kgkeLf8QhbvG7gKmlxIviApGp4cDEzn&_nc_ohc=PBLH2YsYWLEAX8r46gr&_nc_ht=scontent-hbe1-1.xx&oh=a933cba378c335d2d21044a9161ed608&oe=5F54B8A1"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/114584665_709666129590618_1192901954838225081_n.jpg?_nc_cat=104&_nc_sid=b9115d&_nc_eui2=AeE9jN5KITQ1WceL9QFtfya-txSV-QIftTy3FJX5Ah-1PJOQQ2Gi-Rclp9KzFHTOtAu5QsaLT-7QQuXuKwTkd0ut&_nc_ohc=Y4cgnwPTb58AX_W49-N&_nc_ht=scontent.fcai19-1.fna&oh=31299eb78e973fc6b75d28af3c2eccc5&oe=5F57C156"));
        itemsList.add(new customItems("https://scontent-hbe1-1.xx.fbcdn.net/v/t1.0-9/116438957_167555971558406_6648357683393209262_o.jpg?_nc_cat=106&_nc_sid=825194&_nc_eui2=AeENkqnIRyxeU8PkYRqx9VAbTlYBDBH7az9OVgEMEftrP1WbL1xr68P6WbRq4aez5_J40781REhR4iJzGxH9aDod&_nc_ohc=_KJJtYwCRXkAX9uosgL&_nc_ht=scontent-hbe1-1.xx&oh=a80f12043f39113bd7b5606f5e0f4740&oe=5F57617D"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/112473198_660665961463176_4491275509045680703_n.jpg?_nc_cat=102&_nc_sid=825194&_nc_eui2=AeGBhx0q1NArkKsCoi2-AHyW5c1tDj2eBmvlzW0OPZ4GawIZrBosIUcd8SzjvFkJAoguwfw9dDWqtrRcJY8bcjNQ&_nc_ohc=4st-NXvdIMMAX__7xKL&_nc_ht=scontent.fcai19-1.fna&oh=aa880b721098902e240c1f80024f808c&oe=5F57F8A3"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/116002194_2688946524695456_5453871522788012265_o.jpg?_nc_cat=102&_nc_sid=825194&_nc_eui2=AeH4eZTROVXS87NTIx7ATDzi1N7MBy9_RYTU3swHL39FhJtfonE8MZappz9APsbHPWG33R--CZoHwOiwot8BAxSI&_nc_ohc=nTFqOkI81cEAX_ZZ0E9&_nc_ht=scontent.fcai19-1.fna&oh=e0371932e63ce746a99aa1281ef56b04&oe=5F54A157"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/110317056_1627795847394550_3456581282278937508_o.jpg?_nc_cat=103&_nc_sid=825194&_nc_eui2=AeHWdKSr__WyO9rvi1kqOiJ5iMFB9tdz30iIwUH213PfSLw-yFmFTGXm_aie8j2RIhRXyeuhx7t9lcrYcYLPuVmt&_nc_ohc=1Q80f_FvNLUAX8f4BVJ&_nc_ht=scontent.fcai19-1.fna&oh=bee11290e6bc51db06f200fa7ce89754&oe=5F55CEAD"));
        itemsList.add(new customItems("https://scontent.fcai19-1.fna.fbcdn.net/v/t1.0-9/114584718_1060084521074330_1544774202560907210_n.jpg?_nc_cat=100&_nc_sid=825194&_nc_eui2=AeF24RbwQlmSo4fLNHoGwS_Bp7ni6R-2G_enueLpH7Yb91CUoOv0F8oe4k_2bwgJboNt6OqUPwp2sR73kbG2jLpa&_nc_ohc=kFBtYO2LwLgAX_5MlfC&_nc_oc=AQnJOYA3idZx6JwBbZ1ued-W5HmHF7ac8YwtyfBD58KXgKMkydTdmezUiTL0jLEimTQ&_nc_ht=scontent.fcai19-1.fna&oh=e8b4e10e30a5770503cac33ed4c91339&oe=5F565905"));
        itemsList.add(new customItems("https://scontent-hbe1-1.xx.fbcdn.net/v/t1.0-9/114417823_3145203705558458_5459347282585036150_n.jpg?_nc_cat=111&_nc_sid=825194&_nc_eui2=AeHTqRcRDZj7z27xEV5yCxrnETlxmut15RoROXGa63XlGnCR-0sn2zoSpGcM0K_oOPdUIlR3zX1A2c2X1P3g9mx-&_nc_ohc=0gMssAeWJ78AX9ZoszW&_nc_ht=scontent-hbe1-1.xx&oh=07b901f915fc231569ec471b833dcf01&oe=5F560230"));
        itemsList.add(new customItems("https://scontent-hbe1-1.xx.fbcdn.net/v/t1.0-9/112650575_2775748835988362_6383880713887330035_o.jpg?_nc_cat=106&_nc_sid=825194&_nc_eui2=AeFONS7Cn302b_b27vVL4zfJtdCGccvCPry10IZxy8I-vE8HShaaCCO3o9A7S0yK1J3qvvNzYtLPVI31Hs_bfG1-&_nc_ohc=e-kNYcOVlakAX9bTJmF&_nc_ht=scontent-hbe1-1.xx&oh=1ed1184e91f5ce9f6578d014c61bd15b&oe=5F57CCDA"));
        itemsList.add(new customItems("https://scontent-mrs2-1.xx.fbcdn.net/v/t1.0-0/p240x240/110161991_2629639870609526_133595276803456503_o.jpg?_nc_cat=108&_nc_sid=825194&_nc_eui2=AeG-KbL97t4FhQpWI676dh6-xdXNRXYji0LF1c1FdiOLQjKsWH2wK2pyCk9Opv_3wWQ3OXKgekaegWuLxAs90MCT&_nc_ohc=hwJKcvjpTkkAX_rv3IL&_nc_ht=scontent-mrs2-1.xx&_nc_tp=6&oh=8b6c7c20f02bb5750cafa97974f8b425&oe=5F5C4111"));
        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        recyclerView.setAdapter(recyclerViewAdapter);


    }


}
