package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import defpackage.hh2;
import defpackage.ot0;
import defpackage.qs9;
import defpackage.r6;
import defpackage.uq4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Object j = new Object();
    public static volatile d k;
    public final ReentrantReadWriteLock a;
    public final ot0 b;
    public volatile int c;
    public final Handler d;
    public final a e;
    public final h f;
    public final C0033d g;
    public final int h;
    public final androidx.emoji2.text.b i;

    public static final class a extends b {
        public volatile androidx.emoji2.text.f b;
        public volatile androidx.emoji2.text.h c;
    }

    public static class b {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }
    }

    public static abstract class c {
        public final h a;
        public int b = 0;
        public final androidx.emoji2.text.b c = new androidx.emoji2.text.b();

        public c(h hVar) {
            this.a = hVar;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0033d implements j {
    }

    public interface e {
    }

    public static abstract class f {
        public void a() {
        }

        public void b() {
        }
    }

    public static class g implements Runnable {
        public final ArrayList a;
        public final int b;

        public g(List list, int i, Throwable th) {
            hh2.m(list, "initCallbacks cannot be null");
            this.a = new ArrayList(list);
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            if (this.b != 1) {
                while (i < size) {
                    ((f) arrayList.get(i)).a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((f) arrayList.get(i)).b();
                    i++;
                }
            }
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.h hVar);
    }

    public interface j {
    }

    public d(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        h hVar = aVar.a;
        this.f = hVar;
        int i2 = aVar.b;
        this.h = i2;
        this.i = aVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ot0(0);
        this.g = new C0033d();
        a aVar2 = new a(this);
        this.e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                hVar.a(new androidx.emoji2.text.c(aVar2));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static d a() {
        d dVar;
        synchronized (j) {
            try {
                dVar = k;
                if (!(dVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return dVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i2) {
        if (!(c() == 1)) {
            r6.g("Not initialized yet");
            return 0;
        }
        hh2.m(charSequence, "charSequence cannot be null");
        androidx.emoji2.text.f fVar = this.e.b;
        fVar.getClass();
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            uq4[] uq4VarArr = (uq4[]) spanned.getSpans(i2, i2 + 1, uq4.class);
            if (uq4VarArr.length > 0) {
                return spanned.getSpanStart(uq4VarArr[0]);
            }
        }
        return ((f.c) fVar.c(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new f.c(i2))).b;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            r6.g("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            a aVar = this.e;
            d dVar = aVar.a;
            try {
                dVar.f.a(new androidx.emoji2.text.c(aVar));
            } catch (Throwable th) {
                dVar.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #0 {all -> 0x0088, blocks: (B:36:0x0060, B:39:0x0065, B:41:0x0069, B:43:0x0076, B:50:0x0095, B:52:0x009f, B:54:0x00a2, B:56:0x00a5, B:58:0x00b5, B:59:0x00b8), top: B:93:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:36:0x0060, B:39:0x0065, B:41:0x0069, B:43:0x0076, B:50:0x0095, B:52:0x009f, B:54:0x00a2, B:56:0x00a5, B:58:0x00b5, B:59:0x00b8), top: B:93:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7 A[Catch: all -> 0x00f9, TRY_ENTER, TryCatch #1 {all -> 0x00f9, blocks: (B:63:0x00c7, B:66:0x00cf, B:48:0x008b), top: B:95:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence g(int r12, int r13, int r14, java.lang.CharSequence r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.g(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void h(f fVar) {
        hh2.m(fVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new g(Arrays.asList(fVar), this.c, null));
            } else {
                this.b.add(fVar);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        a aVar = this.e;
        aVar.getClass();
        Bundle bundle = editorInfo.extras;
        qs9 qs9Var = aVar.c.a;
        int iA = qs9Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? qs9Var.b.getInt(iA + qs9Var.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
