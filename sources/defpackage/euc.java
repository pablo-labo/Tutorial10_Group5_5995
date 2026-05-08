package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.bridge.ReactContext;
import com.indeed.android.jobsearch.R;
import defpackage.buc;
import defpackage.epg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class euc implements b0f {
    public final w24 a;
    public final a94 b = new a94();
    public a c;
    public buc d;

    public static final class a extends Dialog {
        public final /* synthetic */ euc a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, euc eucVar) {
            super(activity, R.style.Theme_Catalyst_RedBox);
            this.a = eucVar;
        }

        @Override // android.app.Dialog
        public final void onCreate(Bundle bundle) {
            Window window = getWindow();
            if (window == null) {
                r6.g("Required value was null.");
                return;
            }
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
            buc bucVar = this.a.d;
            if (bucVar == null) {
                r6.g("Required value was null.");
                return;
            }
            duc ducVar = new duc();
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.m(bucVar, ducVar);
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public final boolean onKeyUp(int i, KeyEvent keyEvent) {
            keyEvent.getClass();
            euc eucVar = this.a;
            w24 w24Var = eucVar.a;
            if (i == 82) {
                w24Var.A();
                return true;
            }
            if (eucVar.b.a(getCurrentFocus(), i)) {
                w24Var.w();
            }
            return super.onKeyUp(i, keyEvent);
        }
    }

    public euc(w24 w24Var) {
        this.a = w24Var;
    }

    @Override // defpackage.b0f
    public final boolean a() {
        a aVar = this.c;
        return aVar != null && aVar.isShowing();
    }

    @Override // defpackage.b0f
    public final void b() {
        w24 w24Var = this.a;
        String strD = w24Var.d();
        Activity activityB = w24Var.b();
        if (activityB == null || activityB.isFinishing()) {
            ReactContext reactContextA = w24Var.a();
            if (reactContextA != null) {
                reactContextA.addLifecycleEventListener(new cuc(new qa0(this, 6), reactContextA));
                return;
            }
            if (strD == null) {
                strD = "N/A";
            }
            s55.f("ReactNative", "Unable to launch redbox because react activity and react context is not available, here is the error that redbox would've displayed: ".concat(strD));
            return;
        }
        buc bucVar = this.d;
        if ((bucVar != null ? bucVar.getContext() : null) != activityB) {
            e(NativeRedBoxSpec.NAME);
        }
        buc bucVar2 = this.d;
        if (bucVar2 != null) {
            w24 w24Var2 = bucVar2.a;
            String strD2 = w24Var2.d();
            nqe[] nqeVarArrU = w24Var2.u();
            if (nqeVarArrU == null) {
                nqeVarArrU = new nqe[0];
            }
            if (w24Var2.l() == null) {
                r6.g("Required value was null.");
                return;
            }
            Pair<String, nqe[]> pairCreate = Pair.create(strD2, nqeVarArrU);
            pairCreate.getClass();
            Pair<String, nqe[]> pairJ = w24Var2.j(pairCreate);
            if (pairJ == null) {
                r6.g("Required value was null.");
                return;
            }
            Object obj = pairJ.first;
            obj.getClass();
            String str = (String) obj;
            Object obj2 = pairJ.second;
            obj2.getClass();
            nqe[] nqeVarArr = (nqe[]) obj2;
            ListView listView = bucVar2.c;
            if (listView == null) {
                wl7.g("stackView");
                throw null;
            }
            listView.setAdapter((ListAdapter) new buc.b(str, nqeVarArr));
            fuc fucVarS = w24Var2.s();
            if (fucVarS != null) {
                fucVarS.b();
                fuc fucVar = bucVar2.b;
                if (fucVar == null || fucVar.a()) {
                    bucVar2.W = false;
                    TextView textView = bucVar2.e;
                    if (textView == null) {
                        wl7.g("reportTextView");
                        throw null;
                    }
                    textView.setVisibility(8);
                    ProgressBar progressBar = bucVar2.f;
                    if (progressBar == null) {
                        wl7.g("loadingIndicator");
                        throw null;
                    }
                    progressBar.setVisibility(8);
                    View view = bucVar2.V;
                    if (view == null) {
                        wl7.g("lineSeparator");
                        throw null;
                    }
                    view.setVisibility(8);
                    Button button = bucVar2.d;
                    if (button == null) {
                        wl7.g("reportButton");
                        throw null;
                    }
                    button.setVisibility(0);
                    Button button2 = bucVar2.d;
                    if (button2 == null) {
                        wl7.g("reportButton");
                        throw null;
                    }
                    button2.setEnabled(true);
                }
            }
        }
        if (this.c == null) {
            a aVar = new a(activityB, this);
            aVar.requestWindowFeature(1);
            buc bucVar3 = this.d;
            if (bucVar3 == null) {
                r6.g("Required value was null.");
                return;
            } else {
                aVar.setContentView(bucVar3);
                this.c = aVar;
            }
        }
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.show();
        }
    }

    @Override // defpackage.b0f
    public final void c() {
        try {
            a aVar = this.c;
            if (aVar != null) {
                aVar.dismiss();
            }
        } catch (IllegalArgumentException e) {
            s55.g("ReactNative", "RedBoxDialogSurfaceDelegate: error while dismissing dialog: ", e);
        }
        this.d = null;
        this.c = null;
    }

    @Override // defpackage.b0f
    public final boolean d() {
        return this.d != null;
    }

    @Override // defpackage.b0f
    public final void e(String str) {
        w24 w24Var = this.a;
        fuc fucVarS = w24Var.s();
        Activity activityB = w24Var.b();
        if (activityB == null || activityB.isFinishing()) {
            String strD = w24Var.d();
            if (strD == null) {
                strD = "N/A";
            }
            s55.f("ReactNative", "Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ".concat(strD));
            return;
        }
        final buc bucVar = new buc(activityB, w24Var, fucVarS);
        LayoutInflater.from(bucVar.getContext()).inflate(R.layout.redbox_view, bucVar);
        ListView listView = (ListView) bucVar.findViewById(R.id.rn_redbox_stack);
        listView.setOnItemClickListener(bucVar);
        bucVar.c = listView;
        ((Button) bucVar.findViewById(R.id.rn_redbox_reload_button)).setOnClickListener(new ai3(bucVar, 1));
        ((Button) bucVar.findViewById(R.id.rn_redbox_dismiss_button)).setOnClickListener(new View.OnClickListener() { // from class: auc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bucVar.a.i();
            }
        });
        fuc fucVar = bucVar.b;
        if (fucVar != null && fucVar.a()) {
            bucVar.f = (ProgressBar) bucVar.findViewById(R.id.rn_redbox_loading_indicator);
            bucVar.V = bucVar.findViewById(R.id.rn_redbox_line_separator);
            TextView textView = (TextView) bucVar.findViewById(R.id.rn_redbox_report_label);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
            bucVar.e = textView;
            Button button = (Button) bucVar.findViewById(R.id.rn_redbox_report_button);
            button.setOnClickListener(bucVar.a0);
            bucVar.d = button;
        }
        this.d = bucVar;
    }

    @Override // defpackage.b0f
    public final void f() {
        this.d = null;
    }
}
