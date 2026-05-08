package defpackage;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import com.facebook.imagepipeline.memory.a;
import com.facebook.imagepipeline.memory.b;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class vfb {
    public final ufb a;
    public b b;
    public ah1 c;
    public b d;
    public b e;
    public yn9 f;
    public cgb g;
    public a h;

    public vfb(ufb ufbVar) {
        this.a = ufbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ah1 a() {
        /*
            r5 = this;
            ufb r0 = r5.a
            mia r1 = r0.b
            lia r2 = r0.d
            ah1 r3 = r5.c
            if (r3 != 0) goto L6e
            java.lang.String r3 = r0.i
            int r4 = r3.hashCode()
            switch(r4) {
                case -1868884870: goto L51;
                case -1106578487: goto L4a;
                case -404562712: goto L34;
                case -402149703: goto L24;
                case 95945896: goto L14;
                default: goto L13;
            }
        L13:
            goto L65
        L14:
            java.lang.String r4 = "dummy"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L65
            td4 r0 = new td4
            r0.<init>()
            r5.c = r0
            goto L6e
        L24:
            java.lang.String r4 = "dummy_with_tracking"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L65
            vd4 r0 = new vd4
            r0.<init>()
            r5.c = r0
            goto L6e
        L34:
            java.lang.String r4 = "experimental"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L65
            x79 r1 = new x79
            int r0 = r0.j
            mia r2 = defpackage.mia.a()
            r1.<init>(r0, r2)
            r5.c = r1
            goto L6e
        L4a:
            java.lang.String r4 = "legacy"
            boolean r3 = r3.equals(r4)
            goto L65
        L51:
            java.lang.String r4 = "legacy_default_params"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L65
            yn1 r0 = new yn1
            wfb r3 = defpackage.tl3.a()
            r0.<init>(r2, r3, r1)
            r5.c = r0
            goto L6e
        L65:
            yn1 r3 = new yn1
            wfb r0 = r0.a
            r3.<init>(r2, r0, r1)
            r5.c = r3
        L6e:
            ah1 r5 = r5.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vfb.a():ah1");
    }

    public final yn9 b(int i) {
        b bVar;
        if (this.f == null) {
            ufb ufbVar = this.a;
            mia miaVar = ufbVar.f;
            wfb wfbVar = ufbVar.e;
            lia liaVar = ufbVar.d;
            if (i == 0) {
                if (this.e == null) {
                    try {
                        this.e = (b) NativeMemoryChunkPool.class.getConstructor(bo9.class, wfb.class, xfb.class).newInstance(liaVar, wfbVar, miaVar);
                    } catch (ClassNotFoundException e) {
                        s55.g("PoolFactory", "", e);
                        this.e = null;
                    } catch (IllegalAccessException e2) {
                        s55.g("PoolFactory", "", e2);
                        this.e = null;
                    } catch (InstantiationException e3) {
                        s55.g("PoolFactory", "", e3);
                        this.e = null;
                    } catch (NoSuchMethodException e4) {
                        s55.g("PoolFactory", "", e4);
                        this.e = null;
                    } catch (InvocationTargetException e5) {
                        s55.g("PoolFactory", "", e5);
                        this.e = null;
                    }
                }
                bVar = this.e;
            } else if (i == 1) {
                if (this.d == null) {
                    try {
                        this.d = (b) BufferMemoryChunkPool.class.getConstructor(bo9.class, wfb.class, xfb.class).newInstance(liaVar, wfbVar, miaVar);
                    } catch (ClassNotFoundException unused) {
                        this.d = null;
                    } catch (IllegalAccessException unused2) {
                        this.d = null;
                    } catch (InstantiationException unused3) {
                        this.d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.d = null;
                    } catch (InvocationTargetException unused5) {
                        this.d = null;
                    }
                }
                bVar = this.d;
            } else {
                if (i != 2) {
                    l5.q("Invalid MemoryChunkType");
                    return null;
                }
                if (this.b == null) {
                    try {
                        this.b = (b) AshmemMemoryChunkPool.class.getConstructor(bo9.class, wfb.class, xfb.class).newInstance(liaVar, wfbVar, miaVar);
                    } catch (ClassNotFoundException unused6) {
                        this.b = null;
                    } catch (IllegalAccessException unused7) {
                        this.b = null;
                    } catch (InstantiationException unused8) {
                        this.b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.b = null;
                    } catch (InvocationTargetException unused10) {
                        this.b = null;
                    }
                }
                bVar = this.b;
            }
            web.h(bVar, "failed to get pool for chunk type: " + i);
            this.f = new yn9(bVar, c());
        }
        return this.f;
    }

    public final cgb c() {
        if (this.g == null) {
            if (this.h == null) {
                ufb ufbVar = this.a;
                this.h = new a(ufbVar.d, ufbVar.g, ufbVar.h);
            }
            this.g = new cgb(this.h);
        }
        return this.g;
    }
}
