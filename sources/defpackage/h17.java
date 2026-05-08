package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.c27;
import defpackage.s8;
import defpackage.t8;
import expo.modules.imagepicker.ImagePickerOptions;
import expo.modules.imagepicker.MediaTypes;
import expo.modules.kotlin.exception.Exceptions$ReactContextLost;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class h17 implements ik0<i17, c27> {
    public final sx9 a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MediaTypes.values().length];
            try {
                iArr[MediaTypes.VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaTypes.IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public h17(sx9 sx9Var) {
        sx9Var.getClass();
        this.a = sx9Var;
    }

    @Override // defpackage.ik0
    public final Intent a(wi0 wi0Var, Serializable serializable) {
        i17 i17Var = (i17) serializable;
        i17Var.getClass();
        if (i17Var.a().getLegacy()) {
            ImagePickerOptions imagePickerOptionsA = i17Var.a();
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("*/*");
            int i = a.a[imagePickerOptionsA.getNativeMediaTypes().ordinal()];
            Intent intentPutExtra = type.putExtra("android.intent.extra.MIME_TYPES", i != 1 ? i != 2 ? new String[]{"image/*", "video/*"} : new String[]{"image/*"} : new String[]{"video/*"});
            if (imagePickerOptionsA.getAllowsMultipleSelection()) {
                intentPutExtra.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            }
            intentPutExtra.getClass();
            return intentPutExtra;
        }
        int iA = s8.a.a();
        t8.b.C0422b c0422b = t8.b.C0422b.a;
        int i2 = a.a[i17Var.a().getNativeMediaTypes().ordinal()];
        t8.g gVar = i2 != 1 ? i2 != 2 ? t8.c.a : t8.d.a : t8.f.a;
        boolean orderedSelection = i17Var.a().getOrderedSelection();
        t8.b defaultTab = i17Var.a().getDefaultTab().toDefaultTab();
        defaultTab.getClass();
        cab cabVar = new cab();
        cabVar.a = gVar;
        cabVar.b = iA;
        cabVar.c = orderedSelection;
        cabVar.d = defaultTab;
        if (i17Var.a().getAllowsMultipleSelection()) {
            int selectionLimit = i17Var.a().getSelectionLimit();
            if (selectionLimit == 1) {
                return new t8().a(wi0Var, cabVar);
            }
            if (selectionLimit > 1) {
                return new s8(selectionLimit).a(wi0Var, cabVar);
            }
            if (selectionLimit == 0) {
                return new s8(s8.a.a()).a(wi0Var, cabVar);
            }
        }
        return new t8().a(wi0Var, cabVar);
    }

    @Override // defpackage.ik0
    public final c27 b(Serializable serializable, int i, Intent intent) {
        c27 cVar;
        i17 i17Var = (i17) serializable;
        if (i == 0) {
            return c27.a.a;
        }
        if (intent != null) {
            Intent intent2 = i == -1 ? intent : null;
            if (intent2 != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent2.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent2.getClipData();
                if (clipData != null) {
                    l27 l27Var = new l27(clipData);
                    ArrayList arrayList = new ArrayList(t92.r0(l27Var, 10));
                    Iterator<ClipData.Item> it = l27Var.iterator();
                    while (true) {
                        k27 k27Var = (k27) it;
                        if (!k27Var.hasNext()) {
                            break;
                        }
                        arrayList.add(((ClipData.Item) k27Var.next()).getUri());
                    }
                    linkedHashSet.addAll(arrayList);
                }
                List listZ1 = z92.z1(linkedHashSet);
                if (i17Var.a().getAllowsMultipleSelection()) {
                    List<Uri> list = listZ1;
                    ArrayList arrayList2 = new ArrayList(t92.r0(list, 10));
                    for (Uri uri : list) {
                        arrayList2.add(new Pair(j27.e(c(), uri), uri));
                    }
                    List listQ1 = arrayList2;
                    if (i17Var.a().getSelectionLimit() > 0) {
                        listQ1 = z92.q1(arrayList2, i17Var.a().getSelectionLimit());
                    }
                    cVar = new c27.c(listQ1);
                } else if (intent.getData() != null) {
                    Uri data2 = intent.getData();
                    cVar = data2 != null ? new c27.c(u63.Z(new Pair(j27.e(c(), data2), data2))) : null;
                } else {
                    Uri uri2 = (Uri) z92.Q0(listZ1);
                    cVar = uri2 != null ? new c27.c(u63.Z(new Pair(j27.e(c(), uri2), uri2))) : c27.b.a;
                }
                if (cVar != null) {
                    return cVar;
                }
            }
        }
        return c27.b.a;
    }

    public final ContentResolver c() throws Exceptions$ReactContextLost {
        ContentResolver contentResolver;
        ReactApplicationContext reactApplicationContextD = this.a.b().d();
        if (reactApplicationContextD == null || (contentResolver = reactApplicationContextD.getContentResolver()) == null) {
            throw new Exceptions$ReactContextLost();
        }
        return contentResolver;
    }
}
