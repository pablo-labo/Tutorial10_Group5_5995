package defpackage;

import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.credentials.playservices.HiddenActivity;
import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.r;
import androidx.media3.session.x;
import androidx.media3.session.z;
import com.google.android.gms.tasks.OnFailureListener;
import com.indeed.android.jobsearch.LaunchActivity;
import defpackage.c2f;
import defpackage.gdb;
import defpackage.lz8;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tf2 implements jg2, lz8.a, OnFailureListener, cjb, n8, k.c, x.b, c2f.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.session.x.b
    public void a(vdb vdbVar, r.d dVar) {
        ((wq2) this.b).accept(vdbVar);
    }

    @Override // defpackage.cjb
    /* JADX INFO: renamed from: apply */
    public boolean mo35apply(Object obj) {
        Uri uri = (Uri) this.b;
        ot1 ot1Var = (ot1) obj;
        uri.getClass();
        ot1Var.getClass();
        return ot1Var.b(uri);
    }

    @Override // c2f.a
    public Object b() {
        return Integer.valueOf(((q05) this.b).d());
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int i = LaunchActivity.e1;
        ((ActivityResult) obj).getClass();
        launchActivity.S0 = false;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return this.b;
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        gVar.x0(((k) this.b).c, i, null);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((gdb.c) obj).v0(((adb) obj2).m());
                break;
            default:
                ((gdb.c) obj).i0(((z) obj2).B);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.handleCreatePassword$lambda$14$lambda$13((HiddenActivity) this.b, exc);
    }
}
