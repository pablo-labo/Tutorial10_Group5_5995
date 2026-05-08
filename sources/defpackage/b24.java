package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.jsmappservices.util.LocationSensor;
import com.indeed.android.rnonboarding.detectlocation.RequestAndDetectLocationMissingLocationData;
import com.indeed.android.rnonboarding.detectlocation.RequestAndDetectLocationPermissionDenied;
import com.indeed.android.rnonboarding.detectlocation.RequestAndDetectLocationUnexpectedException;
import defpackage.v03;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b24 {
    public final LocationSensor a;
    public final e13 b;
    public Promise c;
    public uqe d;

    @uh3(c = "com.indeed.android.rnonboarding.detectlocation.DetectLocationHandler$startDetectingLocation$1$1", f = "DetectLocationHandler.kt", l = {35}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return b24.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    b24 b24Var = b24.this;
                    this.label = 1;
                    obj = b24.a(b24Var, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                WritableMap writableMap = (WritableMap) obj;
                Promise promise = b24.this.c;
                if (promise != null) {
                    promise.resolve(writableMap);
                }
            } catch (LocationSensor.LocationUnavailableException e) {
                ArrayList arrayList = lz2.a;
                lz2.d("DetectLocationHandler", "Permission denied while detecting location", false, e);
                Promise promise2 = b24.this.c;
                if (promise2 != null) {
                    promise2.reject(new RequestAndDetectLocationPermissionDenied());
                }
            } catch (RequestAndDetectLocationMissingLocationData e2) {
                ArrayList arrayList2 = lz2.a;
                lz2.d("DetectLocationHandler", "Missing location data while detecting location", false, e2);
                Promise promise3 = b24.this.c;
                if (promise3 != null) {
                    promise3.reject(new RequestAndDetectLocationMissingLocationData());
                }
            } catch (CancellationException e3) {
                ArrayList arrayList3 = lz2.a;
                lz2.d("DetectLocationHandler", "Failed to cancel properly", false, e3);
            } catch (Exception e4) {
                ArrayList arrayList4 = lz2.a;
                lz2.g("DetectLocationHandler", "Unexpected error while detecting location", false, e4);
                Promise promise4 = b24.this.c;
                if (promise4 != null) {
                    promise4.reject(new RequestAndDetectLocationUnexpectedException());
                }
            }
            return j6g.a;
        }
    }

    public b24(LocationSensor locationSensor) {
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        eu2 eu2VarA = f13.a(v03.a.C0438a.c(ezeVarA, m89.a.J1()));
        this.a = locationSensor;
        this.b = eu2VarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.b24 r13, defpackage.pu2 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b24.a(b24, pu2):java.lang.Object");
    }

    public final void b() {
        synchronized (this) {
            uqe uqeVar = this.d;
            if (uqeVar != null) {
                uqeVar.h(null);
            }
            this.d = null;
            this.d = u63.Y(this.b, null, null, new a(null), 3);
            j6g j6gVar = j6g.a;
        }
    }
}
