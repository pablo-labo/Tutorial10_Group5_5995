package defpackage;

import android.media.AudioRecord;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.h5b;
import defpackage.xsc;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n30 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IOException {
        AudioRecord audioRecord;
        pw1<j6g> pw1VarZ;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((d40) obj).e();
            case 1:
                return new bxb(((a) obj).g0);
            case 2:
                com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice.a aVar = (com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice.a) obj;
                ((gme) aVar.R().e).setValue(b5g.a);
                aVar.Q(ps7.d, null);
                return j6g.a;
            case 3:
                lk4 lk4Var = (lk4) obj;
                ps7 ps7Var = ps7.b;
                lk4Var.close();
                Function1<? super ps7, j6g> function1 = lk4Var.i0;
                if (function1 != null) {
                    function1.invoke(ps7Var);
                }
                return j6g.a;
            case 4:
                return new bxb(((tl4) obj).g0);
            case 5:
                x35 x35Var = (x35) obj;
                x35Var.getClass();
                FileOutputStream fileOutputStream = new FileOutputStream(x35Var.e);
                int i2 = x35Var.k;
                byte[] bArr = new byte[i2];
                while (true) {
                    if (x35Var.l && (audioRecord = x35Var.b) != null) {
                        int i3 = audioRecord.read(bArr, 0, i2, 0);
                        if (i3 > 0) {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = x35Var.g;
                                if (autoCloseOutputStream != null) {
                                    autoCloseOutputStream.write(bArr, 0, i3);
                                }
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = x35Var.g;
                                if (autoCloseOutputStream2 != null) {
                                    autoCloseOutputStream2.flush();
                                }
                                if (x35Var.a != null) {
                                    fileOutputStream.write(bArr, 0, i3);
                                    fileOutputStream.flush();
                                }
                            } catch (IOException e) {
                                Log.e("ExpoAudioRecorder", "Failed to write to output stream", e);
                                e.printStackTrace();
                            }
                        } else if (i3 == 0) {
                            try {
                                Thread.sleep(10L);
                            } catch (InterruptedException unused) {
                            }
                        } else if (i3 == -6) {
                            Log.w("ExpoAudioRecorder", "AudioRecord returned ERROR_DEAD_OBJECT; breaking out of the loop");
                        } else if (i3 == -3 || i3 == -2) {
                            Log.w("ExpoAudioRecorder", "AudioRecord read error: " + i3 + "; backing off briefly");
                            Thread.sleep(10L);
                        } else {
                            Log.w("ExpoAudioRecorder", "AudioRecord read returned '" + i3 + "'; breaking out of the loop");
                        }
                    }
                }
                fileOutputStream.close();
                return j6g.a;
            case 6:
                return JavaScriptTypedArray.e((JavaScriptTypedArray) obj);
            case 7:
                return new bxb(((b) obj).g0);
            case 8:
                ((h5b) obj).O(h5b.a.b);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                vpb vpbVar = (vpb) obj;
                z1b z1bVar = vpbVar.e;
                spb spbVar = vpbVar.b;
                it5.a();
                opb opbVar = (opb) vpbVar.n.getValue();
                spbVar.getClass();
                return new skf(opbVar, z1bVar);
            case 10:
                x1c x1cVar = (x1c) obj;
                ((gme) x1cVar.V).setValue(exb.a(x1cVar.o(), null, null, null, null, false, false, false, null, false, false, false, false, false, false, 65503));
                return j6g.a;
            case 11:
                ((ksb) obj).close();
                return j6g.a;
            case 12:
                xsc xscVar = (xsc) obj;
                synchronized (xscVar.b) {
                    pw1VarZ = xscVar.z();
                    if (((xsc.d) xscVar.t.getValue()).compareTo(xsc.d.b) <= 0) {
                        Throwable th = xscVar.d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (pw1VarZ != null) {
                    ((qw1) pw1VarZ).resumeWith(j6g.a);
                }
                return j6g.a;
            case 13:
                rsd rsdVar = (rsd) obj;
                oxa oxaVar = (oxa) om2.a(rsdVar, pxa.a);
                rsdVar.q0 = oxaVar;
                rsdVar.r0 = oxaVar != null ? oxaVar.a() : null;
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj;
                searchOverlayFragment.H().e(SearchType.c);
                searchOverlayFragment.I().r(searchOverlayFragment.I().l(), kud.a, null, null);
                return j6g.a;
            case 15:
                return (sl8) ((h3e) obj).d.a;
            default:
                return obj;
        }
    }
}
