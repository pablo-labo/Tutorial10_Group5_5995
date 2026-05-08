package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.trace.AndroidTracer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class p2i<T> implements i3i<T> {
    public static final int[] i = new int[0];
    public static final Unsafe j = t5i.i();
    public final int[] a;
    public final Object[] b;
    public final f2i c;
    public final boolean d;
    public final int[] e;
    public final int f;
    public final beb g;
    public final fwh h;

    public p2i(int[] iArr, Object[] objArr, f2i f2iVar, int[] iArr2, int i2, beb bebVar, fwh fwhVar) {
        this.a = iArr;
        this.b = objArr;
        boolean z = false;
        if (fwhVar != null && (f2iVar instanceof zxh)) {
            z = true;
        }
        this.d = z;
        this.e = iArr2;
        this.f = i2;
        this.g = bebVar;
        this.h = fwhVar;
        this.c = f2iVar;
    }

    public static boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof oyh) {
            return ((oyh) obj).l();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.p2i n(defpackage.v1i r30, defpackage.beb r31, defpackage.iwh r32) {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2i.n(v1i, beb, iwh):p2i");
    }

    public static int o(Object obj, long j2) {
        return ((Integer) t5i.h(obj, j2)).intValue();
    }

    public static int p(int i2) {
        return (i2 >>> 20) & 255;
    }

    public static long r(Object obj, long j2) {
        return ((Long) t5i.h(obj, j2)).longValue();
    }

    public static Field t(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbF = u40.f("Field ", str, " for ", name, " not found. Known fields are ");
            sbF.append(string);
            throw new RuntimeException(sbF.toString(), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // defpackage.i3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r22, defpackage.h6i r23) {
        /*
            Method dump skipped, instruction units count: 1744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2i.a(java.lang.Object, h6i):void");
    }

    @Override // defpackage.i3i
    public final boolean b(oyh oyhVar, oyh oyhVar2) {
        boolean zE;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int iQ = q(i2);
                long j2 = iQ & 1048575;
                switch (p(iQ)) {
                    case 0:
                        if (i(oyhVar, oyhVar2, i2)) {
                            r5i r5iVar = t5i.c;
                            if (Double.doubleToLongBits(r5iVar.d(oyhVar, j2)) == Double.doubleToLongBits(r5iVar.d(oyhVar2, j2))) {
                                continue;
                                i2 += 3;
                            }
                        }
                        break;
                    case 1:
                        if (i(oyhVar, oyhVar2, i2)) {
                            r5i r5iVar2 = t5i.c;
                            if (Float.floatToIntBits(r5iVar2.f(oyhVar, j2)) == Float.floatToIntBits(r5iVar2.f(oyhVar2, j2))) {
                                continue;
                                i2 += 3;
                            }
                        }
                        break;
                    case 2:
                        if (i(oyhVar, oyhVar2, i2) && t5i.f(oyhVar, j2) == t5i.f(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (i(oyhVar, oyhVar2, i2) && t5i.f(oyhVar, j2) == t5i.f(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (i(oyhVar, oyhVar2, i2) && t5i.e(oyhVar, j2) == t5i.e(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (i(oyhVar, oyhVar2, i2) && t5i.f(oyhVar, j2) == t5i.f(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (i(oyhVar, oyhVar2, i2) && t5i.e(oyhVar, j2) == t5i.e(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (i(oyhVar, oyhVar2, i2)) {
                            r5i r5iVar3 = t5i.c;
                            if (r5iVar3.k(oyhVar, j2) == r5iVar3.k(oyhVar2, j2)) {
                                continue;
                                i2 += 3;
                            }
                        }
                        break;
                    case 8:
                        if (i(oyhVar, oyhVar2, i2) && o3i.e(t5i.h(oyhVar, j2), t5i.h(oyhVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        if (i(oyhVar, oyhVar2, i2) && o3i.e(t5i.h(oyhVar, j2), t5i.h(oyhVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (i(oyhVar, oyhVar2, i2) && o3i.e(t5i.h(oyhVar, j2), t5i.h(oyhVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (i(oyhVar, oyhVar2, i2) && t5i.e(oyhVar, j2) == t5i.e(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (i(oyhVar, oyhVar2, i2) && t5i.e(oyhVar, j2) == t5i.e(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (i(oyhVar, oyhVar2, i2) && t5i.e(oyhVar, j2) == t5i.e(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        if (i(oyhVar, oyhVar2, i2) && t5i.f(oyhVar, j2) == t5i.f(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (i(oyhVar, oyhVar2, i2) && t5i.e(oyhVar, j2) == t5i.e(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (i(oyhVar, oyhVar2, i2) && t5i.f(oyhVar, j2) == t5i.f(oyhVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (i(oyhVar, oyhVar2, i2) && o3i.e(t5i.h(oyhVar, j2), t5i.h(oyhVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 18:
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case RendererMetrics.SAMPLES /* 30 */:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zE = o3i.e(t5i.h(oyhVar, j2), t5i.h(oyhVar2, j2));
                        break;
                    case 50:
                        zE = o3i.e(t5i.h(oyhVar, j2), t5i.h(oyhVar2, j2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = iArr[i2 + 2] & 1048575;
                        if (t5i.e(oyhVar, j3) == t5i.e(oyhVar2, j3) && o3i.e(t5i.h(oyhVar, j2), t5i.h(oyhVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    default:
                        i2 += 3;
                        break;
                }
                if (zE) {
                    i2 += 3;
                }
            } else if (oyhVar.zzc.equals(oyhVar2.zzc)) {
                if (this.d) {
                    return ((zxh) oyhVar).zzb.equals(((zxh) oyhVar2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.i3i
    public final boolean c(Object obj) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i6 < this.f) {
            int i8 = this.e[i6];
            int[] iArr = this.a;
            int i9 = iArr[i8];
            int iQ = q(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i7) {
                if (i11 != 1048575) {
                    i5 = j.getInt(obj, i11);
                }
                i3 = i8;
                i4 = i5;
                i2 = i11;
            } else {
                int i13 = i5;
                i2 = i7;
                i3 = i8;
                i4 = i13;
            }
            if ((268435456 & iQ) == 0 || k(obj, i3, i2, i4, i12)) {
                int iP = p(iQ);
                if (iP != 9 && iP != 17) {
                    if (iP != 27) {
                        if (iP == 60 || iP == 68) {
                            if (!m(obj, i9, i3) || s(i3).c(t5i.h(obj, iQ & 1048575))) {
                            }
                        } else if (iP != 49) {
                            if (iP == 50 && !((m1i) t5i.h(obj, iQ & 1048575)).isEmpty()) {
                                int i14 = i3 / 3;
                                throw null;
                            }
                        }
                        i6++;
                        i7 = i2;
                        i5 = i4;
                    }
                    List list = (List) t5i.h(obj, iQ & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        i3i i3iVarS = s(i3);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (i3iVarS.c(list.get(i15))) {
                            }
                        }
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                } else if (!k(obj, i3, i2, i4, i12) || s(i3).c(t5i.h(obj, iQ & 1048575))) {
                    i6++;
                    i7 = i2;
                    i5 = i4;
                }
            }
            return false;
        }
        if (this.d) {
            ((zxh) obj).zzb.c();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.i3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.oyh r11) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2i.d(oyh):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    @Override // defpackage.i3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(defpackage.oyh r19) {
        /*
            Method dump skipped, instruction units count: 1994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2i.e(oyh):int");
    }

    public final void f(int i2, Object obj, Object obj2) {
        if (j(i2, obj2)) {
            int iQ = q(i2) & 1048575;
            Unsafe unsafe = j;
            long j2 = iQ;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                r6.g(v40.c(this.a[i2], "Source subfield ", " is present but null: ", obj2.toString()));
                return;
            }
            i3i i3iVarS = s(i2);
            if (!j(i2, obj)) {
                if (l(object)) {
                    oyh oyhVarZze = i3iVarS.zze();
                    i3iVarS.zzg(oyhVarZze, object);
                    unsafe.putObject(obj, j2, oyhVarZze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                h(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!l(object2)) {
                oyh oyhVarZze2 = i3iVarS.zze();
                i3iVarS.zzg(oyhVarZze2, object2);
                unsafe.putObject(obj, j2, oyhVarZze2);
                object2 = oyhVarZze2;
            }
            i3iVarS.zzg(object2, object);
        }
    }

    public final void g(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (m(obj2, i3, i2)) {
            int iQ = q(i2) & 1048575;
            Unsafe unsafe = j;
            long j2 = iQ;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                r6.g(v40.c(iArr[i2], "Source subfield ", " is present but null: ", obj2.toString()));
                return;
            }
            i3i i3iVarS = s(i2);
            if (!m(obj, i3, i2)) {
                if (l(object)) {
                    oyh oyhVarZze = i3iVarS.zze();
                    i3iVarS.zzg(oyhVarZze, object);
                    unsafe.putObject(obj, j2, oyhVarZze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                t5i.j(obj, iArr[i2 + 2] & 1048575, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!l(object2)) {
                oyh oyhVarZze2 = i3iVarS.zze();
                i3iVarS.zzg(oyhVarZze2, object2);
                unsafe.putObject(obj, j2, oyhVarZze2);
                object2 = oyhVarZze2;
            }
            i3iVarS.zzg(object2, object);
        }
    }

    public final void h(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        t5i.j(obj, j2, (1 << (i3 >>> 20)) | t5i.e(obj, j2));
    }

    public final boolean i(oyh oyhVar, oyh oyhVar2, int i2) {
        return j(i2, oyhVar) == j(i2, oyhVar2);
    }

    public final boolean j(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & t5i.e(obj, j2)) != 0;
        }
        int iQ = q(i2);
        long j3 = iQ & 1048575;
        switch (p(iQ)) {
            case 0:
                if (Double.doubleToRawLongBits(t5i.c.d(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(t5i.c.f(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (t5i.f(obj, j3) != 0) {
                }
                break;
            case 3:
                if (t5i.f(obj, j3) != 0) {
                }
                break;
            case 4:
                if (t5i.e(obj, j3) != 0) {
                }
                break;
            case 5:
                if (t5i.f(obj, j3) != 0) {
                }
                break;
            case 6:
                if (t5i.e(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object objH = t5i.h(obj, j3);
                if (!(objH instanceof String)) {
                    if (!(objH instanceof ivh)) {
                        o6.h();
                        break;
                    } else if (!ivh.a.equals(objH)) {
                    }
                } else if (!((String) objH).isEmpty()) {
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                if (t5i.h(obj, j3) != null) {
                }
                break;
            case 10:
                if (!ivh.a.equals(t5i.h(obj, j3))) {
                }
                break;
            case 11:
                if (t5i.e(obj, j3) != 0) {
                }
                break;
            case 12:
                if (t5i.e(obj, j3) != 0) {
                }
                break;
            case 13:
                if (t5i.e(obj, j3) != 0) {
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                if (t5i.f(obj, j3) != 0) {
                }
                break;
            case 15:
                if (t5i.e(obj, j3) != 0) {
                }
                break;
            case 16:
                if (t5i.f(obj, j3) != 0) {
                }
                break;
            case 17:
                if (t5i.h(obj, j3) != null) {
                }
                break;
            default:
                o6.h();
                break;
        }
        return false;
    }

    public final boolean k(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? j(i2, obj) : (i4 & i5) != 0;
    }

    public final boolean m(Object obj, int i2, int i3) {
        return t5i.e(obj, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    public final int q(int i2) {
        return this.a[i2 + 1];
    }

    public final i3i s(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.b;
        i3i i3iVar = (i3i) objArr[i4];
        if (i3iVar != null) {
            return i3iVar;
        }
        i3i i3iVarA = y2i.c.a((Class) objArr[i4 + 1]);
        objArr[i4] = i3iVarA;
        return i3iVarA;
    }

    @Override // defpackage.i3i
    public final oyh zze() {
        return (oyh) ((oyh) this.c).e(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // defpackage.i3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2i.zzf(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.i3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2i.zzg(java.lang.Object, java.lang.Object):void");
    }
}
