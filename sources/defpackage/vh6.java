package defpackage;

import android.app.Activity;
import androidx.activity.result.ActivityResult;
import androidx.credentials.playservices.HiddenActivity;
import androidx.fragment.app.g;
import androidx.media3.session.l;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.x;
import androidx.media3.session.z;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.tasks.OnFailureListener;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.azg;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.s87;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vh6 implements OnFailureListener, n8, lz8.a, t.g, x.e, g8b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vh6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                int i2 = LaunchActivity.e1;
                ((ActivityResult) obj).getClass();
                Function1<? super et7, j6g> function1 = launchActivity.W0;
                qv8 qv8VarA = hh1.A(launchActivity);
                ft7 ft7VarA = ((at7) cr8.p(at7.class)).a();
                if (ft7VarA == ft7.c) {
                    ((e1g) cr8.p(e1g.class)).a(launchActivity);
                }
                if (function1 != null) {
                    u63.Y(qv8VarA, null, null, new ct7(function1, ft7VarA, null), 3);
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                m8c m8cVar = (m8c) obj2;
                Boolean bool = (Boolean) obj;
                int i3 = m8c.r0;
                bool.getClass();
                ((gme) m8cVar.o0).setValue(Boolean.FALSE);
                m8cVar.D();
                if (!bool.booleanValue()) {
                    Integer numC = ((kq7) cr8.p(kq7.class)).c("PushPrimer", 0, "PushNotificationDenyCount");
                    ((kq7) cr8.p(kq7.class)).a((numC != null ? numC.intValue() : 0) + 1, "PushPrimer", "PushNotificationDenyCount");
                    m8cVar.P(false);
                } else {
                    g activity = m8cVar.getActivity();
                    if (activity != null) {
                        ((e1g) cr8.p(e1g.class)).a(activity);
                    }
                    m8cVar.P(true);
                }
                break;
            default:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                Map map = (Map) obj;
                map.getClass();
                if (map.containsValue(Boolean.TRUE) && searchOverlayFragment.j()) {
                    aud audVarH = searchOverlayFragment.H();
                    SearchType searchTypeM = searchOverlayFragment.I().m();
                    audVarH.getClass();
                    searchTypeM.getClass();
                    Lazy<s87> lazy = s87.f;
                    gz4 gz4VarA = audVarH.a();
                    tx5 tx5Var = audVarH.b;
                    String strM = ak2.M(searchTypeM);
                    ey5 ey5Var = ey5.b;
                    tx5Var.getClass();
                    ey5Var.getClass();
                    s87.a.a(gz4VarA, new lx5("location_share", "interaction", "locationShare", 1, tx5Var.a, new fy5(strM, ey5Var)));
                    searchOverlayFragment.I().y(azg.h.a);
                    searchOverlayFragment.I().z();
                } else {
                    aud audVarH2 = searchOverlayFragment.H();
                    SearchType searchTypeM2 = searchOverlayFragment.I().m();
                    audVarH2.getClass();
                    searchTypeM2.getClass();
                    Lazy<s87> lazy2 = s87.f;
                    gz4 gz4VarA2 = audVarH2.a();
                    tx5 tx5Var2 = audVarH2.b;
                    String strM2 = ak2.M(searchTypeM2);
                    by5 by5Var = by5.b;
                    tx5Var2.getClass();
                    by5Var.getClass();
                    s87.a.a(gz4VarA2, new lx5("location_deny", "interaction", "locationDeny", 1, tx5Var2.a, new cy5(strM2, by5Var)));
                    searchOverlayFragment.I().y(azg.g.a);
                }
                break;
        }
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.b).g.t.B();
    }

    @Override // androidx.media3.session.x.e
    public Object g(final s sVar, final r.d dVar, final int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 5:
                return sVar.m(dVar, e47.n((ij9) obj));
            case 6:
                return sVar.m(dVar, (List) obj);
            default:
                return x.h(sVar, dVar, i, (x.e) obj, new wq2() { // from class: cm9
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
                    @Override // defpackage.wq2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void accept(java.lang.Object r3) {
                        /*
                            r2 = this;
                            hz8 r3 = (defpackage.hz8) r3
                            java.lang.String r0 = "MediaSessionStub"
                            java.lang.Object r3 = r3.get()     // Catch: java.lang.InterruptedException -> L10 java.util.concurrent.ExecutionException -> L12 java.util.concurrent.CancellationException -> L14
                            x9e r3 = (defpackage.x9e) r3     // Catch: java.lang.InterruptedException -> L10 java.util.concurrent.ExecutionException -> L12 java.util.concurrent.CancellationException -> L14
                            java.lang.String r1 = "SessionResult must not be null"
                            defpackage.ka2.o(r3, r1)     // Catch: java.lang.InterruptedException -> L10 java.util.concurrent.ExecutionException -> L12 java.util.concurrent.CancellationException -> L14
                            goto L38
                        L10:
                            r3 = move-exception
                            goto L16
                        L12:
                            r3 = move-exception
                            goto L16
                        L14:
                            r3 = move-exception
                            goto L2d
                        L16:
                            java.lang.String r1 = "Session operation failed"
                            defpackage.zkd.U(r0, r1, r3)
                            x9e r0 = new x9e
                            java.lang.Throwable r3 = r3.getCause()
                            boolean r3 = r3 instanceof java.lang.UnsupportedOperationException
                            if (r3 == 0) goto L27
                            r3 = -6
                            goto L28
                        L27:
                            r3 = -1
                        L28:
                            r0.<init>(r3)
                            r3 = r0
                            goto L38
                        L2d:
                            java.lang.String r1 = "Session operation cancelled"
                            defpackage.zkd.U(r0, r1, r3)
                            x9e r3 = new x9e
                            r0 = 1
                            r3.<init>(r0)
                        L38:
                            androidx.media3.session.s r0 = r1
                            androidx.media3.session.r$d r1 = r2
                            int r2 = r3
                            androidx.media3.session.x.n1(r0, r1, r2, r3)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm9.accept(java.lang.Object):void");
                    }
                });
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                ((gdb.c) obj).T(((z) obj2).E);
                break;
            default:
                z zVar = ((l.c) obj2).a;
                ((gdb.c) obj).z(zVar.r, zVar.s);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5((HiddenActivity) this.b, exc);
    }

    @Override // defpackage.g8b
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        n8b n8bVar = (n8b) this.b;
        strArr.getClass();
        iArr.getClass();
        if (i != 13) {
            return false;
        }
        synchronized (n8bVar) {
            try {
                j8b j8bVar = n8bVar.g;
                if (j8bVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                j8bVar.a(n8bVar.n(strArr, iArr));
                n8bVar.g = null;
                Pair pair = (Pair) n8bVar.f.poll();
                if (pair != null) {
                    i8 i8Var = n8bVar.b;
                    Activity activityB = i8Var != null ? i8Var.b() : null;
                    f8b f8bVar = activityB instanceof f8b ? (f8b) activityB : null;
                    if (f8bVar != null) {
                        n8bVar.g = (j8b) pair.e();
                        f8bVar.x((String[]) pair.d(), 13, new vh6(n8bVar, 8));
                        return false;
                    }
                    j8b j8bVar2 = (j8b) pair.e();
                    String[] strArr2 = (String[]) pair.d();
                    int length = ((Object[]) pair.d()).length;
                    int[] iArr2 = new int[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = -1;
                    }
                    j8bVar2.a(n8bVar.n(strArr2, iArr2));
                    for (Pair pair2 : n8bVar.f) {
                        j8b j8bVar3 = (j8b) pair2.e();
                        String[] strArr3 = (String[]) pair2.d();
                        int length2 = ((Object[]) pair2.d()).length;
                        int[] iArr3 = new int[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            iArr3[i3] = -1;
                        }
                        j8bVar3.a(n8bVar.n(strArr3, iArr3));
                    }
                    n8bVar.f.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
