package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.fragment.app.g;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.mg1;
import defpackage.nq7;
import defpackage.os7;
import defpackage.pld;
import defpackage.q55;
import defpackage.qq7;
import defpackage.s87;
import defpackage.sp7;
import defpackage.ur7;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.player.a;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import uqc.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o91 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o91(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws Exception {
        c25 c25Var;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int i;
        int iMin;
        double dMax;
        g activity;
        dqa dqaVarR;
        int i2 = this.a;
        b5g b5gVar = b5g.a;
        int i3 = 12;
        Object obj = this.b;
        switch (i2) {
            case 0:
                qf8<Object>[] qf8VarArr = p91.i0;
                ((p91) obj).M().b.setVisibility(8);
                return j6g.a;
            case 1:
                mg1 mg1Var = (mg1) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                nva nvaVar = mg1Var.b;
                mg1.a aVar = new mg1.a(mg1Var.a.K1());
                uqc uqcVar = new uqc(aVar);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(uqcVar.peek().new a(), null, options);
                Exception exc = aVar.b;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = n25.a;
                if (mg1Var.d.a(options.outMimeType)) {
                    e25 e25Var = new e25(new g25(uqcVar.peek().new a()));
                    int iD = e25Var.d(1, "Orientation");
                    c25Var = new c25(e25Var.n(), iD == 2 || iD == 7 || iD == 4 || iD == 5);
                } else {
                    c25Var = c25.c;
                }
                int i4 = c25Var.b;
                boolean z2 = c25Var.a;
                Exception exc2 = aVar.b;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                q55.b<ColorSpace> bVar = z27.d;
                ColorSpace colorSpace = (ColorSpace) r55.b(nvaVar, bVar);
                Context context = nvaVar.a;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = (ColorSpace) r55.b(nvaVar, bVar);
                }
                options.inPremultiplied = ((Boolean) r55.b(nvaVar, z27.e)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) r55.b(nvaVar, z27.c);
                if ((z2 || i4 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) r55.b(nvaVar, z27.i)).booleanValue() && config == Bitmap.Config.ARGB_8888 && wl7.b(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i5 = options.outWidth;
                if (i5 <= 0 || (i = options.outHeight) <= 0) {
                    options.inSampleSize = 1;
                    z = false;
                    options.inScaled = false;
                } else {
                    int i6 = (i4 == 90 || i4 == 270) ? i : i5;
                    if (i4 != 90 && i4 != 270) {
                        i5 = i;
                    }
                    iie iieVar = nvaVar.b;
                    umd umdVar = nvaVar.c;
                    long jA = wj3.a(i6, i5, iieVar, umdVar, (iie) r55.b(nvaVar, x27.a));
                    int i7 = (int) (jA >> 32);
                    int i8 = (int) (jA & 4294967295L);
                    int iHighestOneBit = Integer.highestOneBit(i6 / i7);
                    int iHighestOneBit2 = Integer.highestOneBit(i5 / i8);
                    int iOrdinal = umdVar.ordinal();
                    if (iOrdinal == 0) {
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                    } else {
                        if (iOrdinal != 1) {
                            l.g();
                            return null;
                        }
                        iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                    }
                    if (iMin < 1) {
                        iMin = 1;
                    }
                    options.inSampleSize = iMin;
                    double d = iMin;
                    double d2 = ((double) i5) / d;
                    double d3 = ((double) i7) / (((double) i6) / d);
                    double d4 = ((double) i8) / d2;
                    int iOrdinal2 = umdVar.ordinal();
                    if (iOrdinal2 == 0) {
                        dMax = Math.max(d3, d4);
                    } else {
                        if (iOrdinal2 != 1) {
                            l.g();
                            return null;
                        }
                        dMax = Math.min(d3, d4);
                    }
                    if (nvaVar.d == dib.b && dMax > 1.0d) {
                        dMax = 1.0d;
                    }
                    boolean z3 = dMax == 1.0d;
                    options.inScaled = !z3;
                    if (!z3) {
                        if (dMax > 1.0d) {
                            options.inDensity = gf9.a(2.147483647E9d / dMax);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = gf9.a(2.147483647E9d * dMax);
                        }
                    }
                    z = false;
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(uqcVar.new a(), null, options);
                    uqcVar.close();
                    Exception exc3 = aVar.b;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (bitmapDecodeStream == null) {
                        r6.g("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z2 || i4 > 0) {
                        Matrix matrix = new Matrix();
                        float width = bitmapDecodeStream.getWidth() / 2.0f;
                        float height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z2) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i4 > 0) {
                            matrix.postRotate(i4, width, height);
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f = rectF.left;
                        if (f != 0.0f || rectF.top != 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i4 == 90 || i4 == 270) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = bitmapDecodeStream.getWidth();
                            int height3 = bitmapDecodeStream.getHeight();
                            Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, n25.a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    return new uj3(r37.b(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c0h.q(uqcVar, th);
                        throw th2;
                    }
                }
            case 2:
                ((h23) obj).close();
                return j6g.a;
            case 3:
                return new g64((h64) obj);
            case 4:
                return Boolean.valueOf(!((ja4) obj).m2());
            case 5:
                return new bxb(((gi4) obj).i0);
            case 6:
                cj4 cj4Var = (cj4) obj;
                ((gme) cj4Var.R().e).setValue(b5gVar);
                cj4Var.Q(ps7.d, null);
                return j6g.a;
            case 7:
                qj6 qj6Var = (qj6) obj;
                int i9 = qj6.r0;
                bp6 bp6Var = qj6Var.Y;
                bp6Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), tx5.k(bp6Var.b, "ian-main-screen", "top-nav-notifications", null, 12));
                qj6Var.d0().c.k(new jz2<>(Boolean.TRUE));
                return j6g.a;
            case 8:
                ((gme) ((IanMainFragment) obj).H().a0).setValue(Boolean.FALSE);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(indeedApplyWebViewFragment.P(), tx5.k(indeedApplyWebViewFragment.t0, "IndeedApplyWebViewFragment", "discard-application-dialog-discard", null, 12));
                indeedApplyWebViewFragment.Q().g(false);
                ((JSTBroadcast) cr8.p(JSTBroadcast.class)).dispatch(new JSTBroadcastEvent.ApplyFinished("cancel", (String) indeedApplyWebViewFragment.I0.getValue()));
                gu5<j6g> gu5Var = indeedApplyWebViewFragment.G0;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                indeedApplyWebViewFragment.F(false, false);
                return j6g.a;
            case 10:
                ((wj7) obj).i.invoke();
                return j6g.a;
            case 11:
                nf9 nf9Var = (nf9) obj;
                ((gme) nf9Var.Q().e).setValue(b5gVar);
                nf9Var.close();
                Function2<? super hs7, ? super as7, j6g> function2 = nf9Var.h0;
                if (function2 != null) {
                    function2.invoke(hs7.c, null);
                }
                return j6g.a;
            case 12:
                ((rq7) cr8.p(rq7.class)).b((lr5) obj, new wa(i3));
                return j6g.a;
            case 13:
                return ((yw9) obj).M();
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                vpb vpbVar = (vpb) obj;
                spb spbVar = vpbVar.b;
                return vpbVar.i(new z8c(spbVar.i.h(), spbVar.j, spbVar.a), new olf[]{new LocalExifThumbnailProducer(spbVar.i.i(), spbVar.j, spbVar.a)});
            case 15:
                ((vr7) cr8.p(vr7.class)).b(t40.g((crb) obj), new os7.c(null, new hm0(13)), new ur7.c(""));
                return j6g.a;
            case 16:
                fyb fybVar = (fyb) obj;
                int i10 = fyb.n0;
                fybVar.Y.i("PROFILE");
                if (!fybVar.Y() && ((h2g) cr8.p(h2g.class)).a() && (activity = fybVar.getActivity()) != null && (dqaVarR = activity.r()) != null) {
                    dqaVarR.d();
                }
                return j6g.a;
            case 17:
                x1c x1cVar = (x1c) obj;
                eqb eqbVarJ = x1cVar.j();
                String str = eqbVarJ.b;
                fv6 fv6Var = eqbVarJ.c;
                gu5<j6g> gu5Var2 = eqbVarJ.d;
                str.getClass();
                fv6Var.getClass();
                gu5Var2.getClass();
                ((gme) x1cVar.W).setValue(new eqb(false, str, fv6Var, gu5Var2));
                return j6g.a;
            case 18:
                m8c m8cVar = (m8c) obj;
                d8c d8cVar = m8cVar.k0;
                s8c s8cVar = m8cVar.m0;
                d8cVar.a(s8cVar, m8cVar.Q());
                p8c p8cVar = (p8c) m8cVar.j0.getValue();
                String string = s8cVar.toString();
                boolean zQ = m8cVar.Q();
                p8cVar.getClass();
                p8c.b(string, zQ);
                if (Build.VERSION.SDK_INT < 33) {
                    m8cVar.D();
                    m8cVar.P(true);
                } else if (m8cVar.Q()) {
                    m8cVar.D();
                    m8cVar.P(false);
                } else {
                    ((gme) m8cVar.o0).setValue(Boolean.TRUE);
                    m8cVar.q0.a("android.permission.POST_NOTIFICATIONS");
                }
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                f8d f8dVar = (f8d) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "resume-options-menu", "download", null));
                g3a<jz2<j6g>> g3aVar = f8dVar.Q().j0;
                j6g j6gVar = j6g.a;
                g3aVar.k(new jz2<>(j6gVar));
                f8dVar.close();
                return j6gVar;
            case 20:
                ((pld) obj).q(new pld.c.a(0));
                return j6g.a;
            case 21:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().e(searchOverlayFragment.I().m());
                searchOverlayFragment.I().r(searchOverlayFragment.I().l(), kud.a, null, null);
                return j6g.a;
            case 22:
                mud mudVar = (mud) obj;
                int i11 = mud.t0;
                mudVar.Y.i("SEARCH");
                mudVar.Y();
                return j6g.a;
            case 23:
                return new ooa(((ooa) ((ese) obj).getValue()).a);
            case 24:
                ((ae0) obj).f = false;
                return j6g.a;
            case 25:
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = ((n6f) obj).requireActivity().u();
                lr5VarU.getClass();
                rq7Var.c(lr5VarU, new nq7.f(new qq7.h(false), new ju(i3)), null);
                return j6g.a;
            case 26:
                gu5<j6g> gu5Var3 = ((rgf) obj).f;
                if (gu5Var3 != null) {
                    gu5Var3.invoke();
                }
                return j6g.a;
            case 27:
                VideoPlayer videoPlayer = (VideoPlayer) obj;
                videoPlayer.a0 = true;
                videoPlayer.s0(new a.i());
                return j6g.a;
            default:
                com.indeed.android.jobsearch.viewjob.a aVar2 = (com.indeed.android.jobsearch.viewjob.a) obj;
                int i12 = com.indeed.android.jobsearch.viewjob.a.H0;
                ((ua6) aVar2.p0.getValue()).c(false, new ji(aVar2, 17));
                return j6g.a;
        }
    }
}
