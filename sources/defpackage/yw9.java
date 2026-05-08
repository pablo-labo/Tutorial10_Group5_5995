package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.grg;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyw9;", "Lzm0;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class yw9 extends zm0 {
    public LaunchActivity h0;
    public boolean i0 = true;
    public final ArrayList j0 = new ArrayList();
    public final frg k0 = os5.a(this, fwc.a.b(jq6.class), new b(this), new c(this), new d(this));
    public vw9 l0;
    public final z8<Intent> m0;

    public static final /* synthetic */ class a extends qv5 implements Function1<String, String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String strE = str;
            strE.getClass();
            ArrayList arrayList = ((yw9) this.receiver).j0;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof gra) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                strE = ((gra) it.next()).e(strE);
            }
            return strE;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yw9 yw9Var) {
            super(0);
            this.$this_activityViewModels = yw9Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(yw9 yw9Var) {
            super(0);
            this.$this_activityViewModels = yw9Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class d extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(yw9 yw9Var) {
            super(0);
            this.$this_activityViewModels = yw9Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public yw9() {
        z8<Intent> z8VarRegisterForActivityResult = registerForActivityResult(new w8(), new yy1(this, 4));
        z8VarRegisterForActivityResult.getClass();
        this.m0 = z8VarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.f
    public final int G() {
        return R.style.Theme_IndeedJobSearch_BottomModal;
    }

    @Override // androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        Dialog dialogH = super.H(bundle);
        Window window = dialogH.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = R.style.Animation_IndeedJobSearch_BottomModal;
        }
        Window window2 = dialogH.getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        return dialogH;
    }

    public final LaunchActivity M() {
        LaunchActivity launchActivity = this.h0;
        if (launchActivity != null) {
            return launchActivity;
        }
        wl7.g("activity");
        throw null;
    }

    public abstract ModalWebview N();

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.h0 = (LaunchActivity) context;
    }

    @Override // defpackage.zm0, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        N().onPause();
    }

    @Override // defpackage.zm0, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        N().onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.j0;
        for (Object obj : arrayList2) {
            if (obj instanceof ora) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i = 10;
            ((ora) it.next()).b(N(), new m91(this, 5), new hp0(this, i), new lg(i));
        }
        N().b = new a(1, this, yw9.class, "onResolveUserAgent", "onResolveUserAgent(Ljava/lang/String;)Ljava/lang/String;", 0);
        N().c();
        N().setWebViewClient(new ww9(arrayList2, new wm1(this, 11), ((jq6) this.k0.getValue()).d0, new cq0(this, 9), this.i0));
        N().setDownloadListener(new o87(M()));
        if (this.l0 == null) {
            this.l0 = new vw9(new o91(this, 13), new oq(this, 15), this.m0, null, null);
        }
        N().setWebChromeClient(this.l0);
        KeyEvent.Callback callbackI = I();
        if (callbackI instanceof hqa) {
            dqa dqaVarR = ((hqa) callbackI).r();
            zw9 zw9Var = new zw9(this);
            dqaVarR.getClass();
            dqaVarR.b(zw9Var);
        }
    }
}
