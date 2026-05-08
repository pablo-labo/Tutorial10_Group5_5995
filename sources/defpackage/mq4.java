package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class mq4 implements qo3 {
    public final /* synthetic */ kv8 a;

    public mq4(EmojiCompatInitializer emojiCompatInitializer, kv8 kv8Var) {
        this.a = kv8Var;
    }

    @Override // defpackage.qo3
    public final void onResume(zv8 zv8Var) {
        (Build.VERSION.SDK_INT >= 28 ? in2.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.a.c(this);
    }
}
