package com.rivereactnative;

import app.rive.runtime.kotlin.core.Loop;

/* JADX INFO: loaded from: classes3.dex */
public enum e {
    OneShot("oneShot"),
    Loop("loop"),
    PingPong("pingPong"),
    Auto("auto");

    public static final a a = new a();
    private final String mValue;

    public static final class a {

        /* JADX INFO: renamed from: com.rivereactnative.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0191a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Loop.values().length];
                try {
                    iArr[Loop.ONESHOT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Loop.LOOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Loop.PINGPONG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Loop.AUTO.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
                int[] iArr2 = new int[e.values().length];
                try {
                    iArr2[0] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[1] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[2] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[3] = 4;
                } catch (NoSuchFieldError unused8) {
                }
            }
        }
    }

    e(String str) {
        this.mValue = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mValue;
    }
}
