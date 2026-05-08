package defpackage;

import android.app.Activity;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class axg implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new a(new axg()));

    public static final class a extends mj8 implements gu5<zk6> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(axg axgVar) {
            super(0);
            this.$this_inject = axgVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zk6] */
        @Override // defpackage.gu5
        public final zk6 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zk6.class), a9cVar);
        }
    }

    public static Pair a(String str, ArrayList arrayList, z8 z8Var, gu5 gu5Var, Function1 function1, Function1 function12, Function1 function13, nxg nxgVar, hq6 hq6Var, gu5 gu5Var2, zh zhVar, nj njVar, nv nvVar, vk3 vk3Var, int i) {
        hq6 hq6Var2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : hq6Var;
        gu5 vm1Var = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new vm1(21) : gu5Var2;
        gu5 pd1Var = (i & 2048) != 0 ? new pd1(20) : zhVar;
        nj njVar2 = (i & 4096) != 0 ? null : njVar;
        nv nvVar2 = (i & 8192) != 0 ? null : nvVar;
        vk3 vk3Var2 = (i & 16384) != 0 ? null : vk3Var;
        str.getClass();
        arrayList.getClass();
        z8Var.getClass();
        p0b p0bVar = new p0b(nxgVar, nvVar2);
        vq1 vq1Var = new vq1();
        lf6 lf6Var = new lf6((Activity) gu5Var.invoke());
        gsc gscVar = new gsc(new fj2(19, (byte) 0));
        fsc fscVar = new fsc(pd1Var);
        dp5 dp5Var = new dp5();
        Object objInvoke = gu5Var.invoke();
        objInvoke.getClass();
        ArrayList arrayListH1 = z92.h1(u63.a0(p0bVar, vq1Var, lf6Var, gscVar, fscVar, dp5Var, new k98((LaunchActivity) objInvoke), new j77(), new h0b(njVar2)), arrayList);
        ModalWebview modalWebview = new ModalWebview((Context) gu5Var.invoke(), null);
        vw9 vw9Var = new vw9(new yw0(9, gu5Var), new zwg(modalWebview, 0), z8Var, new wa(20), vk3Var2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListH1) {
            if (obj instanceof ora) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((ora) it.next()).b(modalWebview, function1, function12, function13);
        }
        Object objInvoke2 = gu5Var.invoke();
        objInvoke2.getClass();
        modalWebview.setDownloadListener(new o87((LaunchActivity) objInvoke2));
        modalWebview.setWebViewClient(new ww9(arrayListH1, gu5Var, hq6Var2, vm1Var, true));
        modalWebview.setWebChromeClient(vw9Var);
        modalWebview.getSettings().setJavaScriptEnabled(true);
        modalWebview.getSettings().setCacheMode(-1);
        modalWebview.getSettings().setDomStorageEnabled(true);
        modalWebview.getSettings().setDatabaseEnabled(true);
        WebSettings settings = modalWebview.getSettings();
        d2f d2fVar = ajg.a;
        String userAgentString = modalWebview.getSettings().getUserAgentString();
        userAgentString.getClass();
        settings.setUserAgentString(ajg.a(userAgentString));
        modalWebview.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        CookieManager.getInstance().setAcceptThirdPartyCookies(modalWebview, true);
        pxc pxcVar = b87.a;
        b87.b(str);
        modalWebview.loadUrl(str);
        dd4 dd4Var = dd4.a;
        if (dd4.l()) {
            t8e t8eVar = vme.a;
            modalWebview.addJavascriptInterface(new sqf(), "SnowplowWebInterface");
            modalWebview.addJavascriptInterface(new tqf(), "SnowplowWebInterfaceV2");
        }
        return new Pair(modalWebview, vw9Var);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
