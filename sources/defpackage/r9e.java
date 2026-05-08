package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class r9e extends mj8 implements Function1<SharedPreferences.Editor, j6g> {
    final /* synthetic */ s9e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9e(s9e s9eVar) {
        super(1);
        this.this$0 = s9eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(SharedPreferences.Editor editor) {
        SharedPreferences.Editor editor2 = editor;
        editor2.getClass();
        editor2.putLong("lastActivityTime", this.this$0.c);
        editor2.putLong("currentSessionStartTime", this.this$0.d);
        editor2.putString("currentSessionId", this.this$0.e);
        editor2.putLong("lastSessionEndTime", this.this$0.f);
        return j6g.a;
    }
}
