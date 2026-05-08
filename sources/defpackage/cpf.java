package defpackage;

import android.os.Trace;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class cpf extends ox4<cpf> {
    public static final pgb<cpf> f = new pgb<>(3);
    public MotionEvent a;
    public epf b;
    public short c;
    public float d;
    public float e;

    public static final class a {
        public static cpf a(int i, int i2, epf epfVar, MotionEvent motionEvent, long j, float f, float f2, dpf dpfVar) {
            dpfVar.getClass();
            SparseIntArray sparseIntArray = dpfVar.a;
            cpf cpfVarAcquire = cpf.f.acquire();
            if (cpfVarAcquire == null) {
                cpfVarAcquire = new cpf();
            }
            hh1.n(motionEvent);
            cpfVarAcquire.init(i, i2, motionEvent.getEventTime());
            short s = 0;
            SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                sparseIntArray.put((int) j, 0);
            } else if (action == 1) {
                sparseIntArray.delete((int) j);
            } else if (action == 2) {
                int i3 = sparseIntArray.get((int) j, -1);
                if (i3 == -1) {
                    b0.o("Tried to get non-existent cookie");
                    return null;
                }
                s = (short) (i3 & 65535);
            } else if (action == 3) {
                sparseIntArray.delete((int) j);
            } else if (action == 5 || action == 6) {
                int i4 = (int) j;
                int i5 = sparseIntArray.get(i4, -1);
                if (i5 == -1) {
                    b0.o("Tried to increment non-existent cookie");
                    return null;
                }
                sparseIntArray.put(i4, i5 + 1);
            }
            cpfVarAcquire.a = MotionEvent.obtain(motionEvent);
            cpfVarAcquire.b = epfVar;
            cpfVarAcquire.c = s;
            cpfVarAcquire.d = f;
            cpfVarAcquire.e = f2;
            return cpfVarAcquire;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[epf.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.ox4
    public final boolean canCoalesce() {
        epf epfVar = this.b;
        hh1.n(epfVar);
        int i = b.a[epfVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.b);
    }

    @Override // defpackage.ox4
    @sy3
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.getClass();
        if (this.a == null) {
            ReactSoftExceptionLogger.logSoftException("cpf", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        } else {
            ipf.c(rCTEventEmitter, this);
        }
    }

    @Override // defpackage.ox4
    public final void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        WritableMap[] writableMapArr;
        WritableMap writableMap;
        WritableMap[] writableMapArr2;
        rCTModernEventEmitter.getClass();
        if (this.a == null) {
            ReactSoftExceptionLogger.logSoftException("cpf", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
            return;
        }
        int viewTag = getViewTag();
        char c = getSurfaceId() == -1 ? (char) 1 : (char) 2;
        if (c == 1 && viewTag % 10 != 1 && viewTag % 2 == 0) {
            c = 2;
        }
        if (c == 1) {
            ipf.c(rCTModernEventEmitter, this);
            return;
        }
        if (c != 2) {
            return;
        }
        Trace.beginSection(jpf.g("TouchesHelper.sentTouchEventModern(" + getEventName() + ")"));
        try {
            epf epfVar = this.b;
            hh1.n(epfVar);
            MotionEvent motionEvent = this.a;
            hh1.n(motionEvent);
            WritableMap[] writableMapArrA = ipf.a(this);
            int iOrdinal = epfVar.ordinal();
            int i = 0;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    int actionIndex = motionEvent.getActionIndex();
                    WritableMap writableMap2 = writableMapArrA[actionIndex];
                    writableMapArrA[actionIndex] = null;
                    writableMapArr2 = new WritableMap[]{writableMap2};
                } else if (iOrdinal == 2) {
                    writableMapArr2 = new WritableMap[writableMapArrA.length];
                    for (int i2 = 0; i2 < writableMapArrA.length; i2++) {
                        WritableMap writableMap3 = writableMapArrA[i2];
                        writableMapArr2[i2] = writableMap3 != null ? writableMap3.copy() : null;
                    }
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    writableMapArr = new WritableMap[0];
                }
                writableMapArrA = writableMapArr2;
                writableMapArr = writableMapArrA;
            } else {
                WritableMap writableMap4 = writableMapArrA[motionEvent.getActionIndex()];
                WritableMap[] writableMapArr3 = {writableMap4 != null ? writableMap4.copy() : null};
                writableMapArr = writableMapArrA;
                writableMapArrA = writableMapArr3;
            }
            while (i < writableMapArrA.length) {
                int i3 = i + 1;
                try {
                    WritableMap writableMap5 = writableMapArrA[i];
                    if (writableMap5 != null) {
                        WritableMap writableMapCopy = writableMap5.copy();
                        WritableArray writableArrayB = ipf.b(true, writableMapArrA);
                        WritableArray writableArrayB2 = ipf.b(true, writableMapArr);
                        writableMapCopy.putArray("changedTouches", writableArrayB);
                        writableMapCopy.putArray("touches", writableArrayB2);
                        writableMap = writableMapCopy;
                    } else {
                        writableMap = null;
                    }
                    rCTModernEventEmitter.receiveEvent(getSurfaceId(), getViewTag(), getEventName(), canCoalesce(), 0, writableMap, getEventCategory());
                    i = i3;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        return this.c;
    }

    @Override // defpackage.ox4
    public final int getEventCategory() {
        epf epfVar = this.b;
        if (epfVar == null) {
            return 2;
        }
        int iOrdinal = epfVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return 4;
            }
            if (iOrdinal != 3) {
                l.g();
                return 0;
            }
        }
        return 1;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        epf epfVar = this.b;
        hh1.n(epfVar);
        epf.a.getClass();
        return epfVar.a();
    }

    @Override // defpackage.ox4
    public final void onDispose() {
        MotionEvent motionEvent = this.a;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.a = null;
        try {
            f.a(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException("cpf", e);
        }
    }
}
