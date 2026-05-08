package com.google.android.recaptcha.internal;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzs implements zzaj {
    public static final /* synthetic */ zzs zza;
    public static final /* synthetic */ zzs zzb;
    public static final /* synthetic */ zzs zzc;
    public static final /* synthetic */ zzs zzd;
    public static final /* synthetic */ zzs zze;
    public static final /* synthetic */ zzs zzf;
    public static final /* synthetic */ zzs zzg;
    public static final /* synthetic */ zzs zzh;
    public static final /* synthetic */ zzs zzi;
    public static final /* synthetic */ zzs zzj;
    public static final /* synthetic */ zzs zzk;
    public static final /* synthetic */ zzs zzl;
    public static final /* synthetic */ zzs zzm;
    public static final /* synthetic */ zzs zzn;
    public static final /* synthetic */ zzs zzo;
    public static final /* synthetic */ zzs zzp;
    private final /* synthetic */ int zzq;

    static {
        int i = (((((~386839851) & 502322068) | 1879579667) + ((386839851 & 1341449093) | 1376723995)) - (-1804183289)) ^ (2118801173 % 1119399015);
        int i2 = (((((~310242589) & 1847460522) | 916960512) + ((310242589 & 1486357226) | 346393668)) - 2000278179) ^ (2125023787 % 550804899);
        int i3 = (((((~2025251990) & 688917531) | 1994836270) + ((2025251990 & 152053269) | 883831534)) - (-1390790891)) ^ (1069117832 % 942581876);
        int i4 = (((((~1650994571) & 1371186185) | 1050017619) + ((1650994571 & 1227505800) | 205643505)) - (-1965943233)) ^ (1992865128 % 986478257);
        int i5 = (((((~1199680559) & 1141516237) | 463752220) + ((1199680559 & 1150952403) | 43369530)) - 1260832081) ^ (1435001171 % 1047196295);
        int i6 = (((((~1456339643) & 675645608) | 1411114002) + ((1456339643 & 693897896) | 1427718916)) - (-1019776501)) ^ (1561812722 % 1322623287);
        int i7 = (((((~1978701535) & 466139520) | 1762924265) + ((1978701535 & 315141952) | 1765037774)) - (-506179056)) ^ (1934660183 % 1880346039);
        int i8 = (((((~222028828) & 1142841824) | 166034459) + ((222028828 & 1142555104) | 723801104)) - 1805567702) ^ (829570037 % 301373537);
        int i9 = (((((~1396918184) & 1248054849) | 133905852) + ((1396918184 & 1770570357) | 870268086)) - 2138058592) ^ (1934392735 % 620089368);
        int i10 = (((((~1889804310) & 69748736) | 707083889) + ((1889804310 & 604795188) | 951435263)) - 1284100921) ^ (1663080928 % 610506582);
        int i11 = (((((~672139932) & 1821026947) | 1629321417) + ((672139932 & 214090242) | 828986457)) - (-2020274916)) ^ (1579068977 % 395191309);
        int i12 = (((((~99568484) & 3432473) | 44796710) + ((99568484 & 403994653) | 1028298918)) - 934561551) ^ (1076919591 % 234262547);
        zzp = new zzs((((((~1759592334) & 1334334268) | 1043988652) + ((1759592334 & 1099191056) | 509413516)) - (-1669029722)) ^ (599529154 % 33713861));
        zzo = new zzs((((((~1160063179) & 1841305796) | 575720514) + ((1160063179 & 1300254868) | 1886521)) - 1545499812) ^ (1060494695 % 728149010));
        zzn = new zzs(i12);
        zzm = new zzs(i3);
        zzl = new zzs(i4);
        zzk = new zzs(i5);
        zzj = new zzs(i2);
        zzi = new zzs(i6);
        zzh = new zzs(i7);
        zzg = new zzs(i8);
        zzf = new zzs(i);
        zze = new zzs(i9);
        zzd = new zzs(i10);
        zzc = new zzs(i11);
        zzb = new zzs(1);
        zza = new zzs(0);
    }

    private /* synthetic */ zzs(int i) {
        this.zzq = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzc zzcVar;
        zzar zzarVarZzb;
        int i = ((((~1301053842) & 15767913) | 186261585) + ((1301053842 & (-2132756056)) | (-887741291))) - (-855860664);
        int i2 = 1616992200 % 241315329;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzam) obj).zza();
                                case 1:
                                    try {
                                        zzai zzaiVar = ((zzam) obj).zzb;
                                        long jZzb = zzaiVar.zzb().zzb();
                                        zzar zzarVarZzb2 = zzaiVar.zzb();
                                        List listZzp = zzarVarZzb2.zzp();
                                        if (jZzb < 0) {
                                            jZzb += (long) listZzp.size();
                                        }
                                        if (jZzb < 0 || jZzb >= listZzp.size()) {
                                            throw new zzap();
                                        }
                                        listZzp.remove((int) jZzb);
                                        zzaiVar.zzd(zzarVarZzb2);
                                        return Optional.empty();
                                    } catch (zzap unused) {
                                        zzcVar = zzc.zzI;
                                    }
                                    break;
                                case 2:
                                    zzam zzamVar = (zzam) obj;
                                    zzai zzaiVar2 = zzamVar.zzb;
                                    zzar zzarVarZzb3 = zzaiVar2.zzb();
                                    zzv zzvVarZzc = zzaiVar2.zzb().zzc();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzarVarZzb3.zzq(byteArrayOutputStream);
                                    zzamVar.zzb.zzd(zzar.zzh(zzvVarZzc.zzc(zzv.zzd(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    zzam zzamVar2 = (zzam) obj;
                                    zzai zzaiVar3 = zzamVar2.zzb;
                                    zzar zzarVarZzb4 = zzaiVar3.zzb();
                                    zzv zzvVarZzc2 = zzaiVar3.zzb().zzc();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzr.zzb(zzarVarZzb4.zzb(), new zzaq(byteArrayOutputStream2, i ^ i2), false);
                                    zzamVar2.zzb.zzd(zzar.zzh(zzvVarZzc2.zzc(zzv.zzd(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    zzam zzamVar3 = (zzam) obj;
                                    zzamVar3.zzb.zze(-(zzamVar3.zzc.zza().zzb + zzamVar3.zzd.zzd()), zzamVar3.zzb.zzb());
                                    return Optional.empty();
                                case 5:
                                    zzai zzaiVar4 = ((zzam) obj).zzb;
                                    zzaiVar4.zzd(zzar.zzf(zzaiVar4.zzb().zzb() << ((int) zzaiVar4.zzb().zzb())));
                                    return Optional.empty();
                                case 6:
                                    zzai zzaiVar5 = ((zzam) obj).zzb;
                                    zzaiVar5.zzd(zzar.zzf(zzaiVar5.zzb().zzb() >>> ((int) zzaiVar5.zzb().zzb())));
                                    return Optional.empty();
                                case 7:
                                    zzai zzaiVar6 = ((zzam) obj).zzb;
                                    zzaiVar6.zzd(zzar.zzg(zzaiVar6.zzb().zza() - zzaiVar6.zzb().zza()));
                                    return Optional.empty();
                                case 8:
                                    zzai zzaiVar7 = ((zzam) obj).zzb;
                                    zzaiVar7.zzd(zzar.zzf(zzaiVar7.zzb().zzb() - zzaiVar7.zzb().zzb()));
                                    return Optional.empty();
                                case DatadogLogGenerator.CRASH /* 9 */:
                                    zzam zzamVar4 = (zzam) obj;
                                    zzai zzaiVar8 = zzamVar4.zzb;
                                    long jZzb2 = zzaiVar8.zzb().zzb();
                                    zzar zzarVarZzb5 = zzaiVar8.zzb();
                                    zzai zzaiVar9 = zzamVar4.zzb;
                                    zzar zzarVarZzc = zzaiVar9.zzc(jZzb2);
                                    zzaiVar9.zze(jZzb2, zzarVarZzb5);
                                    zzaiVar9.zzd(zzarVarZzc);
                                    return Optional.empty();
                                case 10:
                                    zzam zzamVar5 = (zzam) obj;
                                    zzai zzaiVar10 = zzamVar5.zzb;
                                    long jZzb3 = zzamVar5.zzc.zza().zzb + zzaiVar10.zzb().zzb();
                                    zzar zzarVarZzb6 = zzaiVar10.zzb();
                                    zzai zzaiVar11 = zzamVar5.zzb;
                                    long j = -jZzb3;
                                    zzar zzarVarZzc2 = zzaiVar11.zzc(j);
                                    zzaiVar11.zze(j, zzarVarZzb6);
                                    zzaiVar11.zzd(zzarVarZzc2);
                                    return Optional.empty();
                                case 11:
                                    zzam zzamVar6 = (zzam) obj;
                                    long jZzd = zzamVar6.zzc.zza().zzb + zzamVar6.zzd.zzd();
                                    zzar zzarVarZzb7 = zzamVar6.zzb.zzb();
                                    zzai zzaiVar12 = zzamVar6.zzb;
                                    long j2 = -jZzd;
                                    zzar zzarVarZzc3 = zzaiVar12.zzc(j2);
                                    zzaiVar12.zze(j2, zzarVarZzb7);
                                    zzaiVar12.zzd(zzarVarZzc3);
                                    return Optional.empty();
                                case 12:
                                    zzam zzamVar7 = (zzam) obj;
                                    long jZzb4 = zzamVar7.zzb.zzb().zzb();
                                    try {
                                        zzai zzaiVar13 = zzamVar7.zzb;
                                        int i3 = ((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 438321650;
                                        int i4 = 1478326644 % 593443203;
                                        if (jZzb4 == 0) {
                                            zzarVarZzb = zzaiVar13.zzb();
                                        } else {
                                            int iZza = zzaiVar13.zza(jZzb4);
                                            zzaiVar13.zzb += i3 ^ i4;
                                            zzarVarZzb = (zzar) zzaiVar13.zza.remove(iZza);
                                        }
                                        zzaiVar13.zzd(zzarVarZzb);
                                        return Optional.empty();
                                    } catch (zzag unused2) {
                                        zzcVar = zzc.zzg;
                                    }
                                    break;
                                case 13:
                                    zzam zzamVar8 = (zzam) obj;
                                    try {
                                        zzai zzaiVar14 = zzamVar8.zzb;
                                        long jZzb5 = zzaiVar14.zzb().zzb();
                                        long jZzb6 = zzaiVar14.zzb().zzb();
                                        zzaf zzafVar = zzamVar8.zzc;
                                        zzaa zzaaVar = zzamVar8.zzd;
                                        zzafVar.zzb(zzaaVar.zzb(), jZzb6, zzafVar.zza().zzb);
                                        zzaaVar.zzf(jZzb5);
                                        return Optional.empty();
                                    } catch (zzad unused3) {
                                        zzcVar = zzc.zzB;
                                    } catch (zzae unused4) {
                                        zzcVar = zzc.zzw;
                                    } catch (zzy | zzz unused5) {
                                        zzcVar = zzc.zzr;
                                    }
                                    break;
                                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                                    zzam zzamVar9 = (zzam) obj;
                                    try {
                                        zzamVar9.zzb.zzd(zzar.zzk(zzamVar9.zzb.zzb().zzo()));
                                        return Optional.empty();
                                    } catch (zzao unused6) {
                                        zzcVar = zzc.zzp;
                                    }
                                    break;
                                default:
                                    try {
                                        zzai zzaiVar15 = ((zzam) obj).zzb;
                                        Iterator it = zzaiVar15.zzb().zzp().iterator();
                                        while (it.hasNext()) {
                                            zzaiVar15.zzd((zzar) it.next());
                                            break;
                                        }
                                        return Optional.empty();
                                    } catch (zzah unused7) {
                                        zzcVar = zzc.zza;
                                    }
                                    break;
                            }
                        } catch (zzao unused8) {
                            zzcVar = zzc.zzk;
                        } catch (IOException e) {
                            e = e;
                            throw new AssertionError(zzt.zza("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (zzag unused9) {
                        zzcVar = zzc.zzh;
                    }
                } catch (zzao | zzx | zzz unused10) {
                    zzcVar = zzc.zzy;
                }
            } catch (zzah e2) {
                e = e2;
                throw new AssertionError(zzt.zza("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzae | zzag unused11) {
            zzcVar = zzc.zzx;
        }
        return Optional.of(zzcVar);
    }
}
