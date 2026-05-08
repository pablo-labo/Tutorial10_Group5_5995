package com.linecorp.linesdk.openchat.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.indeed.android.jobsearch.R;
import com.linecorp.linesdk.api.LineApiClientBuilder;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import defpackage.c63;
import defpackage.d2f;
import defpackage.esg;
import defpackage.fwc;
import defpackage.goa;
import defpackage.gu5;
import defpackage.gua;
import defpackage.hrg;
import defpackage.ja;
import defpackage.l;
import defpackage.l5;
import defpackage.lr5;
import defpackage.mj8;
import defpackage.nrb;
import defpackage.tw8;
import defpackage.u53;
import defpackage.v53;
import defpackage.wi0;
import defpackage.wl7;
import defpackage.x7;
import defpackage.xta;
import defpackage.yd8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/linecorp/linesdk/openchat/ui/CreateOpenChatActivity;", "Lwi0;", "<init>", "()V", "a", "line-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CreateOpenChatActivity extends wi0 {
    public static final /* synthetic */ int u0 = 0;
    public x7 q0;
    public gua s0;
    public final d2f r0 = new d2f(new b());
    public final a t0 = a.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("ChatroomInfo", 0);
            a = aVar;
            a aVar2 = new a("UserProfile", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static final class b extends mj8 implements gu5<tw8> {
        public b() {
            super(0);
        }

        @Override // defpackage.gu5
        public final tw8 invoke() {
            String stringExtra = CreateOpenChatActivity.this.getIntent().getStringExtra("arg_channel_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            tw8 tw8VarBuild = new LineApiClientBuilder(CreateOpenChatActivity.this, stringExtra).build();
            tw8VarBuild.getClass();
            return tw8VarBuild;
        }
    }

    public final int A(a aVar, boolean z) {
        Fragment xtaVar;
        lr5 lr5VarU = u();
        lr5VarU.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(lr5VarU);
        if (z) {
            aVar2.c(aVar.name());
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            xtaVar = new xta();
        } else {
            if (iOrdinal != 1) {
                l.g();
                return 0;
            }
            xtaVar = new nrb();
        }
        aVar2.e(R.id.container, xtaVar, null);
        return aVar2.h(false);
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_create_open_chat, (ViewGroup) null, false);
        int i = R.id.appbar;
        if (((AppBarLayout) esg.a(viewInflate, R.id.appbar)) != null) {
            i = R.id.container;
            if (((ConstraintLayout) esg.a(viewInflate, R.id.container)) != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) esg.a(viewInflate, R.id.progressBar);
                if (progressBar != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) esg.a(viewInflate, R.id.toolbar);
                    if (toolbar != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.q0 = new x7(constraintLayout, progressBar, toolbar);
                        setContentView(constraintLayout);
                        hrg hrgVar = new hrg(getViewModelStore(), new c63(getSharedPreferences("openchat", 0), this), getDefaultViewModelCreationExtras());
                        yd8 yd8VarB = fwc.a.b(gua.class);
                        String strP = yd8VarB.p();
                        if (strP == null) {
                            l5.q("Local and anonymous classes can not be ViewModels");
                            return;
                        }
                        gua guaVar = (gua) hrgVar.a(yd8VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
                        this.s0 = guaVar;
                        guaVar.X.e(this, new u53(this, 0));
                        gua guaVar2 = this.s0;
                        if (guaVar2 == null) {
                            wl7.g("viewModel");
                            throw null;
                        }
                        guaVar2.Y.e(this, new v53(this, 0));
                        gua guaVar3 = this.s0;
                        if (guaVar3 == null) {
                            wl7.g("viewModel");
                            throw null;
                        }
                        guaVar3.Z.e(this, new goa() { // from class: w53
                            @Override // defpackage.goa
                            public final void d(Object obj) {
                                Boolean bool = (Boolean) obj;
                                int i2 = CreateOpenChatActivity.u0;
                                x7 x7Var = this.a.q0;
                                if (x7Var == null) {
                                    wl7.g("binding");
                                    throw null;
                                }
                                ProgressBar progressBar2 = (ProgressBar) x7Var.a;
                                bool.getClass();
                                progressBar2.setVisibility(bool.booleanValue() ? 0 : 8);
                            }
                        });
                        gua guaVar4 = this.s0;
                        if (guaVar4 == null) {
                            wl7.g("viewModel");
                            throw null;
                        }
                        guaVar4.a0.e(this, new goa() { // from class: x53
                            @Override // defpackage.goa
                            public final void d(Object obj) {
                                Boolean bool = (Boolean) obj;
                                int i2 = CreateOpenChatActivity.u0;
                                bool.getClass();
                                if (bool.booleanValue()) {
                                    final CreateOpenChatActivity createOpenChatActivity = this.a;
                                    int i3 = 0;
                                    boolean z = yw8.a(createOpenChatActivity) != null;
                                    c.a aVar = new c.a(createOpenChatActivity);
                                    AlertController.b bVar = aVar.a;
                                    bVar.f = bVar.a.getText(R.string.openchat_not_agree_with_terms);
                                    bVar.n = new DialogInterface.OnDismissListener() { // from class: y53
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            int i4 = CreateOpenChatActivity.u0;
                                            createOpenChatActivity.finish();
                                        }
                                    };
                                    if (z) {
                                        aVar.setPositiveButton(R.string.open_line, new DialogInterface.OnClickListener() { // from class: z53
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                                int i5 = CreateOpenChatActivity.u0;
                                                CreateOpenChatActivity createOpenChatActivity2 = createOpenChatActivity;
                                                createOpenChatActivity2.startActivity(createOpenChatActivity2.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                            }
                                        });
                                        aVar.setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: a63
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                                int i5 = CreateOpenChatActivity.u0;
                                                createOpenChatActivity.finish();
                                            }
                                        });
                                    } else {
                                        aVar.setPositiveButton(android.R.string.ok, new b63(createOpenChatActivity, i3));
                                    }
                                    aVar.b();
                                }
                            }
                        });
                        A(this.t0, false);
                        return;
                    }
                }
            }
        }
        ja.k("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
