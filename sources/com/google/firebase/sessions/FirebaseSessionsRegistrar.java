package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a9e;
import defpackage.b9e;
import defpackage.bg5;
import defpackage.btf;
import defpackage.dae;
import defpackage.fg2;
import defpackage.g7;
import defpackage.g9e;
import defpackage.h00;
import defpackage.h9e;
import defpackage.j6c;
import defpackage.k9e;
import defpackage.l5;
import defpackage.my3;
import defpackage.n71;
import defpackage.p9e;
import defpackage.pf5;
import defpackage.q9e;
import defpackage.t40;
import defpackage.u40;
import defpackage.u63;
import defpackage.uf2;
import defpackage.uh1;
import defpackage.v03;
import defpackage.v40;
import defpackage.vf5;
import defpackage.w20;
import defpackage.y03;
import defpackage.y8c;
import defpackage.zu8;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Luf2;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final a Companion = new a();

    @Deprecated
    private static final y8c<pf5> firebaseApp = y8c.a(pf5.class);

    @Deprecated
    private static final y8c<vf5> firebaseInstallationsApi = y8c.a(vf5.class);

    @Deprecated
    private static final y8c<y03> backgroundDispatcher = new y8c<>(n71.class, y03.class);

    @Deprecated
    private static final y8c<y03> blockingDispatcher = new y8c<>(uh1.class, y03.class);

    @Deprecated
    private static final y8c<btf> transportFactory = y8c.a(btf.class);

    @Deprecated
    private static final y8c<dae> sessionsSettings = y8c.a(dae.class);

    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final bg5 m25getComponents$lambda0(fg2 fg2Var) {
        Object objC = fg2Var.c(firebaseApp);
        objC.getClass();
        Object objC2 = fg2Var.c(sessionsSettings);
        objC2.getClass();
        Object objC3 = fg2Var.c(backgroundDispatcher);
        objC3.getClass();
        return new bg5((pf5) objC, (dae) objC2, (v03) objC3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-1, reason: not valid java name */
    public static final k9e m26getComponents$lambda1(fg2 fg2Var) {
        return new k9e(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-2, reason: not valid java name */
    public static final g9e m27getComponents$lambda2(fg2 fg2Var) {
        Object objC = fg2Var.c(firebaseApp);
        objC.getClass();
        Object objC2 = fg2Var.c(firebaseInstallationsApi);
        objC2.getClass();
        Object objC3 = fg2Var.c(sessionsSettings);
        objC3.getClass();
        j6c j6cVarB = fg2Var.b(transportFactory);
        j6cVarB.getClass();
        h00 h00Var = new h00(j6cVarB);
        Object objC4 = fg2Var.c(backgroundDispatcher);
        objC4.getClass();
        return new h9e((pf5) objC, (vf5) objC2, (dae) objC3, h00Var, (v03) objC4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-3, reason: not valid java name */
    public static final dae m28getComponents$lambda3(fg2 fg2Var) {
        Object objC = fg2Var.c(firebaseApp);
        objC.getClass();
        Object objC2 = fg2Var.c(blockingDispatcher);
        objC2.getClass();
        Object objC3 = fg2Var.c(backgroundDispatcher);
        objC3.getClass();
        Object objC4 = fg2Var.c(firebaseInstallationsApi);
        objC4.getClass();
        return new dae((pf5) objC, (v03) objC2, (v03) objC3, (vf5) objC4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-4, reason: not valid java name */
    public static final a9e m29getComponents$lambda4(fg2 fg2Var) {
        pf5 pf5Var = (pf5) fg2Var.c(firebaseApp);
        pf5Var.a();
        Context context = pf5Var.a;
        context.getClass();
        Object objC = fg2Var.c(backgroundDispatcher);
        objC.getClass();
        return new b9e(context, (v03) objC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-5, reason: not valid java name */
    public static final p9e m30getComponents$lambda5(fg2 fg2Var) {
        Object objC = fg2Var.c(firebaseApp);
        objC.getClass();
        return new q9e((pf5) objC);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uf2<? extends Object>> getComponents() {
        uf2.a aVarB = uf2.b(bg5.class);
        aVarB.a = LIBRARY_NAME;
        y8c<pf5> y8cVar = firebaseApp;
        aVarB.a(my3.a(y8cVar));
        y8c<dae> y8cVar2 = sessionsSettings;
        aVarB.a(my3.a(y8cVar2));
        y8c<y03> y8cVar3 = backgroundDispatcher;
        aVarB.a(my3.a(y8cVar3));
        int i = 14;
        aVarB.f = new l5(i);
        aVarB.c(2);
        uf2 uf2VarB = aVarB.b();
        uf2.a aVarB2 = uf2.b(k9e.class);
        aVarB2.a = "session-generator";
        aVarB2.f = new g7(i);
        uf2 uf2VarB2 = aVarB2.b();
        uf2.a aVarB3 = uf2.b(g9e.class);
        aVarB3.a = "session-publisher";
        aVarB3.a(new my3(y8cVar, 1, 0));
        y8c<vf5> y8cVar4 = firebaseInstallationsApi;
        aVarB3.a(my3.a(y8cVar4));
        aVarB3.a(new my3(y8cVar2, 1, 0));
        aVarB3.a(new my3(transportFactory, 1, 1));
        aVarB3.a(new my3(y8cVar3, 1, 0));
        aVarB3.f = new t40(9);
        uf2 uf2VarB3 = aVarB3.b();
        uf2.a aVarB4 = uf2.b(dae.class);
        aVarB4.a = "sessions-settings";
        aVarB4.a(new my3(y8cVar, 1, 0));
        aVarB4.a(my3.a(blockingDispatcher));
        aVarB4.a(new my3(y8cVar3, 1, 0));
        aVarB4.a(new my3(y8cVar4, 1, 0));
        aVarB4.f = new w20(10);
        uf2 uf2VarB4 = aVarB4.b();
        uf2.a aVarB5 = uf2.b(a9e.class);
        aVarB5.a = "sessions-datastore";
        aVarB5.a(new my3(y8cVar, 1, 0));
        aVarB5.a(new my3(y8cVar3, 1, 0));
        aVarB5.f = new u40(6);
        uf2 uf2VarB5 = aVarB5.b();
        uf2.a aVarB6 = uf2.b(p9e.class);
        aVarB6.a = "sessions-service-binder";
        aVarB6.a(new my3(y8cVar, 1, 0));
        aVarB6.f = new v40(7);
        return u63.a0(uf2VarB, uf2VarB2, uf2VarB3, uf2VarB4, uf2VarB5, aVarB6.b(), zu8.a(LIBRARY_NAME, "1.2.3"));
    }
}
