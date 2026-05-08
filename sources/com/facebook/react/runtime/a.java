package com.facebook.react.runtime;

import android.annotation.SuppressLint;
import defpackage.j6g;
import defpackage.l6;
import defpackage.maf;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> {
    public volatile T a;
    public final T b;
    public volatile b c = b.a;
    public volatile String d = "";

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$a, reason: collision with other inner class name */
    public interface InterfaceC0133a<T> {
        T get();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final /* synthetic */ b[] e;

        static {
            b bVar = new b("Init", 0);
            a = bVar;
            b bVar2 = new b("Creating", 1);
            b = bVar2;
            b bVar3 = new b("Success", 2);
            c = bVar3;
            b bVar4 = new b("Failure", 3);
            d = bVar4;
            e = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(maf mafVar) {
        this.a = mafVar;
        this.b = this.a;
    }

    public final synchronized T a() {
        T t;
        t = this.a;
        if (t == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return t;
    }

    public final synchronized T b() {
        return this.a;
    }

    @SuppressLint({"CatchGeneralException"})
    public final T c(InterfaceC0133a<T> interfaceC0133a) {
        boolean z;
        T tA;
        T tA2;
        synchronized (this) {
            b bVar = this.c;
            b bVar2 = b.c;
            if (bVar == bVar2) {
                return a();
            }
            if (this.c == b.d) {
                throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.d);
            }
            b bVar3 = this.c;
            b bVar4 = b.b;
            boolean z2 = false;
            if (bVar3 != bVar4) {
                this.c = bVar4;
                z = true;
            } else {
                z = false;
            }
            j6g j6gVar = j6g.a;
            if (z) {
                try {
                    this.a = interfaceC0133a.get();
                    synchronized (this) {
                        this.c = bVar2;
                        notifyAll();
                        tA = a();
                    }
                    return tA;
                } catch (RuntimeException e) {
                    synchronized (this) {
                        this.c = b.d;
                        this.d = String.valueOf(e.getMessage());
                        notifyAll();
                        j6g j6gVar2 = j6g.a;
                        l6.p("BridgelessAtomicRef: Failed to create object.", e);
                        return null;
                    }
                }
            }
            synchronized (this) {
                while (this.c == b.b) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                if (this.c == b.d) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.d);
                }
                tA2 = a();
            }
            return tA2;
        }
    }

    public final synchronized void d() {
        this.a = this.b;
        this.c = b.a;
        this.d = "";
    }
}
