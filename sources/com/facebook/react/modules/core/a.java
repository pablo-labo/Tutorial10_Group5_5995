package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import defpackage.dt3;
import defpackage.hh1;
import defpackage.j42;
import defpackage.j6g;
import defpackage.s55;
import defpackage.ujc;
import defpackage.wv4;
import defpackage.z84;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static a f;
    public j42.a a;
    public final ArrayDeque<Choreographer.FrameCallback>[] b;
    public int c;
    public boolean d;
    public final ujc e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.facebook.react.modules.core.a$a, reason: collision with other inner class name */
    public static final class EnumC0132a {
        public static final EnumC0132a a;
        public static final EnumC0132a b;
        public static final EnumC0132a c;
        public static final EnumC0132a d;
        public static final /* synthetic */ EnumC0132a[] e;
        public static final /* synthetic */ wv4 f;
        private final int order;

        static {
            EnumC0132a enumC0132a = new EnumC0132a("PERF_MARKERS", 0, 0);
            EnumC0132a enumC0132a2 = new EnumC0132a("DISPATCH_UI", 1, 1);
            a = enumC0132a2;
            EnumC0132a enumC0132a3 = new EnumC0132a("NATIVE_ANIMATED_MODULE", 2, 2);
            b = enumC0132a3;
            EnumC0132a enumC0132a4 = new EnumC0132a("TIMERS_EVENTS", 3, 3);
            c = enumC0132a4;
            EnumC0132a enumC0132a5 = new EnumC0132a("IDLE_EVENT", 4, 4);
            d = enumC0132a5;
            EnumC0132a[] enumC0132aArr = {enumC0132a, enumC0132a2, enumC0132a3, enumC0132a4, enumC0132a5};
            e = enumC0132aArr;
            f = new wv4(enumC0132aArr);
        }

        public EnumC0132a(String str, int i, int i2) {
            this.order = i2;
        }

        public static EnumC0132a valueOf(String str) {
            return (EnumC0132a) Enum.valueOf(EnumC0132a.class, str);
        }

        public static EnumC0132a[] values() {
            return (EnumC0132a[]) e.clone();
        }

        public final int a() {
            return this.order;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ujc] */
    public a(j42 j42Var) {
        int iA = EnumC0132a.f.a();
        ArrayDeque<Choreographer.FrameCallback>[] arrayDequeArr = new ArrayDeque[iA];
        for (int i = 0; i < iA; i++) {
            arrayDequeArr[i] = new ArrayDeque<>();
        }
        this.b = arrayDequeArr;
        this.e = new Choreographer.FrameCallback() { // from class: ujc
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                a aVar = this.a;
                synchronized (aVar.b) {
                    try {
                        aVar.d = false;
                        int length = aVar.b.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            ArrayDeque<Choreographer.FrameCallback> arrayDeque = aVar.b[i2];
                            int size = arrayDeque.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                Choreographer.FrameCallback frameCallbackPollFirst = arrayDeque.pollFirst();
                                if (frameCallbackPollFirst != null) {
                                    frameCallbackPollFirst.doFrame(j);
                                    aVar.c--;
                                } else {
                                    s55.f("ReactNative", "Tried to execute non-existent frame callback");
                                }
                            }
                        }
                        aVar.a();
                        j6g j6gVar = j6g.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        UiThreadUtil.runOnUiThread(new dt3(5, this, j42Var));
    }

    public final void a() {
        hh1.l(this.c >= 0);
        if (this.c == 0 && this.d) {
            j42.a aVar = this.a;
            if (aVar != null) {
                aVar.a(this.e);
            }
            this.d = false;
        }
    }

    public final void b(EnumC0132a enumC0132a, Choreographer.FrameCallback frameCallback) {
        frameCallback.getClass();
        synchronized (this.b) {
            this.b[enumC0132a.a()].addLast(frameCallback);
            int i = this.c + 1;
            this.c = i;
            hh1.l(i > 0);
            if (!this.d) {
                j42.a aVar = this.a;
                if (aVar == null) {
                    UiThreadUtil.runOnUiThread(new z84(this, 8));
                } else {
                    aVar.b(this.e);
                    this.d = true;
                }
            }
            j6g j6gVar = j6g.a;
        }
    }

    public final void c(EnumC0132a enumC0132a, Choreographer.FrameCallback frameCallback) {
        synchronized (this.b) {
            try {
                if (this.b[enumC0132a.a()].removeFirstOccurrence(frameCallback)) {
                    this.c--;
                    a();
                } else {
                    s55.f("ReactNative", "Tried to remove non-existent frame callback");
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
