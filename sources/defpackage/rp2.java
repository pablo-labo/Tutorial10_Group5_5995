package defpackage;

import androidx.fragment.app.r;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.l;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.tw1;
import expo.modules.kotlin.jni.JNINoArgsFunctionBody;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rp2 implements JNINoArgsFunctionBody, lz8.a, tw1.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((gdb.c) obj).g(((adb) obj2).f);
                break;
            case 2:
                ((gdb.c) obj).g((PlaybackException) obj2);
                break;
            default:
                ((gdb.c) obj).E(((l.c) obj2).a.m);
                break;
        }
    }

    @Override // tw1.a
    public void onCancel() {
        ((r.b) this.b).a();
    }

    @Override // expo.modules.kotlin.jni.JNINoArgsFunctionBody
    public Object invoke() {
        return pt7.a(6, ((sp2) this.b).b.invoke());
    }
}
