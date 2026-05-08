package defpackage;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.ox4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class meb extends ox4<meb> {
    public static final pgb<meb> g = new pgb<>(6);
    public MotionEvent a;
    public String b;
    public List<? extends WritableMap> d;
    public a e;
    public short c = -1;
    public final Lazy f = boa.E(qt8.c, new nj(this, 18));

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final HashMap e;
        public final HashMap f;
        public final HashMap g;
        public final HashMap h;
        public final HashSet i;

        public a(int i, int i2, int i3, int i4, HashMap map, HashMap map2, HashMap map3, HashMap map4, HashSet hashSet) {
            hashSet.getClass();
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = map;
            this.f = map2;
            this.g = map3;
            this.h = map4;
            this.i = new HashSet(hashSet);
        }
    }

    public static final meb c(String str, int i, a aVar, MotionEvent motionEvent) {
        meb mebVarAcquire = g.acquire();
        if (mebVarAcquire == null) {
            mebVarAcquire = new meb();
        }
        hh1.n(motionEvent);
        mebVarAcquire.init(aVar.d, i, motionEvent.getEventTime());
        mebVarAcquire.b = str;
        mebVarAcquire.a = MotionEvent.obtain(motionEvent);
        mebVarAcquire.c = (short) 0;
        mebVarAcquire.e = aVar;
        return mebVarAcquire;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3.equals("topPointerOut") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r3.equals("topPointerCancel") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("topClick") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r3.equals("topPointerUp") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r3.equals("topPointerOver") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r3.equals("topPointerMove") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        r0 = new java.util.ArrayList();
        r3 = r5.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r1 = r3.getPointerCount();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r2 >= r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r0.add(b(r2));
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        defpackage.r6.g("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r3.equals("topPointerDown") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        if (r3.equals("topPointerLeave") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        if (r3.equals("topPointerEnter") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        return defpackage.u63.Z(b(r0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.facebook.react.bridge.WritableMap> a() {
        /*
            r5 = this;
            android.view.MotionEvent r0 = r5.a
            r1 = 0
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L98
            int r0 = r0.getActionIndex()
            java.lang.String r3 = r5.b
            if (r3 == 0) goto L92
            int r4 = r3.hashCode()
            switch(r4) {
                case -1786514288: goto L80;
                case -1780335505: goto L77;
                case -1304584214: goto L6e;
                case -1304316135: goto L46;
                case -1304250340: goto L3d;
                case -1065042973: goto L34;
                case -992108237: goto L2b;
                case 383186882: goto L22;
                case 1343400710: goto L18;
                default: goto L16;
            }
        L16:
            goto L88
        L18:
            java.lang.String r2 = "topPointerOut"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L89
            goto L88
        L22:
            java.lang.String r0 = "topPointerCancel"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4f
            goto L88
        L2b:
            java.lang.String r2 = "topClick"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L89
            goto L88
        L34:
            java.lang.String r2 = "topPointerUp"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L89
            goto L88
        L3d:
            java.lang.String r2 = "topPointerOver"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L89
            goto L88
        L46:
            java.lang.String r0 = "topPointerMove"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4f
            goto L88
        L4f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.MotionEvent r3 = r5.a
            if (r3 == 0) goto L6a
            int r1 = r3.getPointerCount()
            r2 = 0
        L5d:
            if (r2 >= r1) goto L69
            com.facebook.react.bridge.WritableMap r3 = r5.b(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L5d
        L69:
            return r0
        L6a:
            defpackage.r6.g(r2)
            return r1
        L6e:
            java.lang.String r2 = "topPointerDown"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L89
            goto L88
        L77:
            java.lang.String r2 = "topPointerLeave"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L89
            goto L88
        L80:
            java.lang.String r2 = "topPointerEnter"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L89
        L88:
            return r1
        L89:
            com.facebook.react.bridge.WritableMap r5 = r5.b(r0)
            java.util.List r5 = defpackage.u63.Z(r5)
            return r5
        L92:
            java.lang.String r5 = "_eventName"
            defpackage.wl7.g(r5)
            throw r1
        L98:
            defpackage.r6.g(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.meb.a():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f A[PHI: r12
  0x019f: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:66:0x0191, B:72:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.react.bridge.WritableMap b(int r25) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.meb.b(int):com.facebook.react.bridge.WritableMap");
    }

    @Override // defpackage.ox4
    @sy3
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.getClass();
        if (this.a == null) {
            ReactSoftExceptionLogger.logSoftException("meb", new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.d == null) {
            this.d = a();
        }
        List<? extends WritableMap> list = this.d;
        if (list == null) {
            return;
        }
        boolean z = list.size() > 1;
        for (WritableMap writableMapCopy : list) {
            if (z) {
                writableMapCopy = writableMapCopy.copy();
            }
            int viewTag = getViewTag();
            String str = this.b;
            if (str == null) {
                wl7.g("_eventName");
                throw null;
            }
            rCTEventEmitter.receiveEvent(viewTag, str, writableMapCopy);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    @Override // defpackage.ox4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchModern(com.facebook.react.uimanager.events.RCTModernEventEmitter r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.meb.dispatchModern(com.facebook.react.uimanager.events.RCTModernEventEmitter):void");
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        return this.c;
    }

    @Override // defpackage.ox4
    public final ox4.c getEventAnimationDriverMatchSpec() {
        return (ox4.c) this.f.getValue();
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        wl7.g("_eventName");
        throw null;
    }

    @Override // defpackage.ox4
    public final void onDispose() {
        this.d = null;
        MotionEvent motionEvent = this.a;
        this.a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            g.a(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("meb", e);
        }
    }
}
