package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class ttc extends mj8 implements gu5<j6g> {
    final /* synthetic */ stc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttc(stc stcVar) {
        super(0);
        this.this$0 = stcVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        stc stcVar = this.this$0;
        stcVar.g = null;
        Trace.beginSection("OnPositionedDispatch");
        try {
            stcVar.a();
            j6g j6gVar = j6g.a;
            Trace.endSection();
            return j6g.a;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
