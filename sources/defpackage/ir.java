package defpackage;

import android.os.Bundle;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.myjobs.data.model.dto.Event5722DTO;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.indeed.android.rninterviewprep.RNInterviewPrepModule;
import defpackage.lx5;
import defpackage.mr8;
import defpackage.sn1;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ir implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ir(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mr8.b bVar;
        mr8.b bVar2;
        mr8.b bVar3;
        mr8.b bVar4;
        is8 is8Var;
        int i = this.a;
        float f = 0.0f;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((nr) obj2).Q().R(str, "");
                return j6g.a;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                y91 y91Var = (y91) ((WeakReference) obj2).get();
                if (y91Var != null) {
                    y91Var.K(str2);
                }
                return j6g.a;
            case 2:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, (String) obj2);
                return j6g.a;
            case 3:
                h23 h23Var = (h23) obj2;
                Locale locale = (Locale) obj;
                locale.getClass();
                x1c x1cVar = (x1c) h23Var.j0.getValue();
                ((gme) x1cVar.X).setValue(yz7.a(x1cVar.m(), null, null, null, null, null, null, null, locale, null, null, null, null, null, null, 16255));
                x1cVar.J();
                h23Var.close();
                return j6g.a;
            case 4:
                Bundle bundle = (Bundle) obj2;
                Map map = (Map) obj;
                map.getClass();
                Set<String> setKeySet = bundle.keySet();
                setKeySet.getClass();
                for (String str3 : bbe.n(setKeySet, u34.b)) {
                    String string = bundle.getString(str3);
                    if (string != null) {
                        str3.getClass();
                        map.put(str3, string);
                    }
                }
                return j6g.a;
            case 5:
                nn4 nn4Var = (nn4) obj2;
                g2h g2hVar = (g2h) obj;
                g2hVar.getClass();
                yvb yvbVarR = nn4Var.R();
                boolean z = nn4Var.k0;
                ej ejVar = new ej(4, nn4Var, g2hVar);
                if (zve.U(g2hVar.b)) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("ProfileSectionsViewModel", "Work experience title is required, validation is broken", false, null, 12);
                } else if (z) {
                    ejVar.invoke();
                } else {
                    u63.Y(ee3.p(yvbVarR), null, null, new xwb(yvbVarR, g2hVar, ejVar, null), 3);
                }
                return j6g.a;
            case 6:
                SavedJobsDto savedJobsDto = (SavedJobsDto) obj2;
                lx5.b bVar5 = (lx5.b) obj;
                bVar5.getClass();
                boolean indeedApplyable = savedJobsDto.getIndeedApplyable();
                boolean zIsJobExpired = savedJobsDto.isJobExpired();
                Event5722DTO event5722DTO = savedJobsDto.getEvent5722DTO();
                ?? B = event5722DTO != null ? wl7.b(event5722DTO.isJobHosted(), Boolean.TRUE) : 0;
                Event5722DTO event5722DTO2 = savedJobsDto.getEvent5722DTO();
                ?? B2 = event5722DTO2 != null ? wl7.b(event5722DTO2.isApplicationImpacted(), Boolean.TRUE) : 0;
                ?? F = uz.f("indeedapplyable=", indeedApplyable ? 1 : 0, ",jobExpired=", zIsJobExpired ? 1 : 0, ",hosted=");
                F.append(B);
                F.append(",isEvent5722=");
                F.append(B2);
                String string2 = F.toString();
                bVar5.a("subTabName", "Applied");
                bVar5.a("jobKey", savedJobsDto.getJobkey());
                bVar5.a("entityData", string2);
                bVar5.a("encryptedIaAppId", savedJobsDto.getEncryptedIaAppId());
                return j6g.a;
            case 7:
                ss8 ss8Var = (ss8) obj2;
                qs8 qs8Var = ss8Var.q;
                po3 po3Var = ss8Var.a;
                boolean z2 = ss8Var.j;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || ss8Var.d()) && (f2 <= 0.0f || ss8Var.c())) {
                    if (Math.abs(ss8Var.h) > 0.5f) {
                        de7.c("entered drag with non-zero pending scroll");
                    }
                    ss8Var.d = true;
                    float f3 = ss8Var.h + f2;
                    ss8Var.h = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = ss8Var.h;
                        int iRound = Math.round(f4);
                        is8 is8VarL = ((is8) ((gme) ss8Var.f).getValue()).l(iRound, !ss8Var.b);
                        if (is8VarL != null && (is8Var = ss8Var.c) != null) {
                            is8 is8VarL2 = is8Var.l(iRound, true);
                            if (is8VarL2 != null) {
                                ss8Var.c = is8VarL2;
                            } else {
                                is8VarL = null;
                            }
                        }
                        if (is8VarL != null) {
                            ss8Var.g(is8VarL, ss8Var.b, true);
                            ss8Var.v.setValue(j6g.a);
                            float f5 = f4 - ss8Var.h;
                            if (z2) {
                                po3Var.getClass();
                                if (!is8VarL.i().isEmpty()) {
                                    boolean z3 = f5 < 0.0f;
                                    int iA = po3.a(is8VarL, z3);
                                    if (iA >= 0 && iA < is8VarL.f()) {
                                        if (iA != po3Var.a) {
                                            if (po3Var.c != z3) {
                                                po3Var.a = -1;
                                                mr8.b bVar6 = po3Var.b;
                                                if (bVar6 != null) {
                                                    bVar6.cancel();
                                                }
                                                po3Var.b = null;
                                            }
                                            po3Var.c = z3;
                                            po3Var.a = iA;
                                            po3Var.b = qs8Var.a(iA);
                                        }
                                        if (z3) {
                                            zr8 zr8Var = (zr8) z92.Y0(is8VarL.i());
                                            if (((zr8Var.a() + zr8Var.getOffset()) + is8VarL.g()) - is8VarL.e() < (-f5) && (bVar4 = po3Var.b) != null) {
                                                bVar4.c();
                                            }
                                        } else if (is8VarL.h() - ((zr8) z92.O0(is8VarL.i())).getOffset() < f5 && (bVar3 = po3Var.b) != null) {
                                            bVar3.c();
                                        }
                                    }
                                }
                                po3Var.e = f5;
                            }
                        } else {
                            zzc zzcVar = ss8Var.k;
                            if (zzcVar != null) {
                                zzcVar.e();
                            }
                            float f6 = f4 - ss8Var.h;
                            gs8 gs8VarJ = ss8Var.j();
                            if (z2) {
                                po3Var.getClass();
                                if (!gs8VarJ.i().isEmpty()) {
                                    boolean z4 = f6 < 0.0f;
                                    int iA2 = po3.a(gs8VarJ, z4);
                                    if (iA2 >= 0 && iA2 < gs8VarJ.f()) {
                                        if (iA2 != po3Var.a) {
                                            if (po3Var.c != z4) {
                                                po3Var.a = -1;
                                                mr8.b bVar7 = po3Var.b;
                                                if (bVar7 != null) {
                                                    bVar7.cancel();
                                                }
                                                po3Var.b = null;
                                            }
                                            po3Var.c = z4;
                                            po3Var.a = iA2;
                                            po3Var.b = qs8Var.a(iA2);
                                        }
                                        if (z4) {
                                            zr8 zr8Var2 = (zr8) z92.Y0(gs8VarJ.i());
                                            if (((zr8Var2.a() + zr8Var2.getOffset()) + gs8VarJ.g()) - gs8VarJ.e() < (-f6) && (bVar2 = po3Var.b) != null) {
                                                bVar2.c();
                                            }
                                        } else if (gs8VarJ.h() - ((zr8) z92.O0(gs8VarJ.i())).getOffset() < f6 && (bVar = po3Var.b) != null) {
                                            bVar.c();
                                        }
                                    }
                                }
                                po3Var.e = f6;
                            }
                        }
                    }
                    if (Math.abs(ss8Var.h) > 0.5f) {
                        f2 -= ss8Var.h;
                        ss8Var.h = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 8:
                return o6.a((p63) obj, (t41) obj2);
            case DatadogLogGenerator.CRASH /* 9 */:
                dr9 dr9Var = (dr9) obj2;
                if (((j6g) ((jz2) obj).a()) != null) {
                    Bundle arguments = dr9Var.getArguments();
                    String string3 = arguments != null ? arguments.getString("initialUrl") : null;
                    if (string3 != null) {
                        dr9Var.H(string3);
                    }
                }
                return j6g.a;
            case 10:
                o97 o97Var = (o97) obj2;
                gb4 gb4Var = (gb4) obj;
                gb4Var.getClass();
                float fT1 = gb4Var.t1(1.0f);
                float f7 = fT1 / 2.0f;
                gb4Var.W(da2.b(o97Var.c.c.a, 0.3f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - f7)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) - f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() >> 32)))) << 32), fT1, (496 & 16) != 0 ? 0 : 0);
                float fT12 = gb4Var.t1(4.0f);
                gb4.M1(gb4Var, sn1.a.a(u63.a0(new da2(da2.b(o97Var.c.a.c, 0.12f)), new da2(da2.h)), Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)), Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) + fT12, 8), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (gb4Var.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fT12)) & 4294967295L), 0.0f, null, 120);
                return j6g.a;
            case 11:
                sl8 sl8Var = (sl8) obj;
                sl8Var.getClass();
                ((p9d) obj2).i(sl8Var.a());
                return j6g.a;
            case 12:
                return RNInterviewPrepModule.requestMicrophonePermission$lambda$3$lambda$2((Promise) obj2, ((Boolean) obj).booleanValue());
            case 13:
                ((ktc) obj2).b((qh4) obj);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                SearchType searchType = (SearchType) obj;
                searchType.getClass();
                ((gme) ((SearchOverlayFragment) obj2).I().a0).setValue(searchType);
                return j6g.a;
            default:
                cdb cdbVar = (cdb) obj;
                qf8<Object>[] qf8VarArr = VideoPlayer.w0;
                cdbVar.getClass();
                float f8 = cdbVar.a;
                return new cdb(f8, ((VideoPlayer) obj2).i0 ? 1.0f : f8);
        }
    }
}
