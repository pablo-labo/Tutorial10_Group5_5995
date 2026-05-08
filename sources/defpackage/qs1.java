package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import defpackage.nl1;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qs1 implements Function2<View, ReadableArray, j6g> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [zr4] */
    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(View view, ReadableArray readableArray) {
        ?? arrayList;
        View view2 = view;
        ReadableArray readableArray2 = readableArray;
        view2.getClass();
        if (readableArray2 == null) {
            arrayList = zr4.a;
        } else {
            arrayList = new ArrayList();
            int size = readableArray2.size();
            for (int i = 0; i < size; i++) {
                ReadableMap map = readableArray2.getMap(i);
                Context context = view2.getContext();
                context.getClass();
                nl1 nl1VarA = nl1.a.a(context, map);
                if (nl1VarA != null) {
                    arrayList.add(nl1VarA);
                }
            }
        }
        v71.p(view2, arrayList);
        return j6g.a;
    }
}
