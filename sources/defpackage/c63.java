package defpackage;

import android.content.SharedPreferences;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import defpackage.grg;

/* JADX INFO: loaded from: classes3.dex */
public final class c63 implements grg.c {
    public final /* synthetic */ SharedPreferences a;
    public final /* synthetic */ CreateOpenChatActivity b;

    public c63(SharedPreferences sharedPreferences, CreateOpenChatActivity createOpenChatActivity) {
        this.a = sharedPreferences;
        this.b = createOpenChatActivity;
    }

    @Override // grg.c
    public final <T extends brg> T c(Class<T> cls) {
        if (!cls.isAssignableFrom(gua.class)) {
            r6.g("Unknown ViewModel class");
            return null;
        }
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.getClass();
        return new gua(sharedPreferences, (tw8) this.b.r0.getValue());
    }
}
