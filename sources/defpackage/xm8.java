package defpackage;

import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes2.dex */
public class xm8 extends loc {
    public final a n0 = new a();

    public static class a {
        public float a;
        public r6h b;

        public final void a(Dynamic dynamic) {
            boolean zIsNull = dynamic.isNull();
            r6h r6hVar = r6h.UNDEFINED;
            if (zIsNull) {
                this.b = r6hVar;
                this.a = Float.NaN;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                if (dynamic.getType() == ReadableType.Number) {
                    this.b = r6h.POINT;
                    this.a = nn2.G((float) dynamic.asDouble());
                    return;
                } else {
                    this.b = r6hVar;
                    this.a = Float.NaN;
                    return;
                }
            }
            String strAsString = dynamic.asString();
            if (strAsString.equals("auto")) {
                this.b = r6h.AUTO;
                this.a = Float.NaN;
            } else if (strAsString.endsWith("%")) {
                this.b = r6h.PERCENT;
                this.a = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
            } else {
                s55.n("ReactNative", "Unknown value: ".concat(strAsString));
                this.b = r6hVar;
                this.a = Float.NaN;
            }
        }
    }

    public final int l0(int i) {
        mkf mkfVar = this.d;
        hh1.n(mkfVar);
        if (mkfVar.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
            if (i == 0) {
                return 4;
            }
            if (i == 2) {
                return 5;
            }
        }
        return i;
    }

    @snc(name = "alignContent")
    public void setAlignContent(String str) {
        if (E()) {
        }
        a6h a6hVar = a6h.FLEX_START;
        if (str == null) {
            d0(a6hVar);
            return;
        }
        switch (str) {
            case "stretch":
                d0(a6h.STRETCH);
                break;
            case "baseline":
                d0(a6h.BASELINE);
                break;
            case "center":
                d0(a6h.CENTER);
                break;
            case "flex-start":
                d0(a6hVar);
                break;
            case "auto":
                d0(a6h.AUTO);
                break;
            case "space-between":
                d0(a6h.SPACE_BETWEEN);
                break;
            case "flex-end":
                d0(a6h.FLEX_END);
                break;
            case "space-around":
                d0(a6h.SPACE_AROUND);
                break;
            case "space-evenly":
                d0(a6h.SPACE_EVENLY);
                break;
            default:
                s55.n("ReactNative", "invalid value for alignContent: ".concat(str));
                d0(a6hVar);
                break;
        }
    }

    @snc(name = "alignItems")
    public void setAlignItems(String str) {
        if (E()) {
        }
        a6h a6hVar = a6h.STRETCH;
        if (str == null) {
            e0(a6hVar);
            return;
        }
        switch (str) {
            case "stretch":
                e0(a6hVar);
                break;
            case "baseline":
                e0(a6h.BASELINE);
                break;
            case "center":
                e0(a6h.CENTER);
                break;
            case "flex-start":
                e0(a6h.FLEX_START);
                break;
            case "auto":
                e0(a6h.AUTO);
                break;
            case "space-between":
                e0(a6h.SPACE_BETWEEN);
                break;
            case "flex-end":
                e0(a6h.FLEX_END);
                break;
            case "space-around":
                e0(a6h.SPACE_AROUND);
                break;
            default:
                s55.n("ReactNative", "invalid value for alignItems: ".concat(str));
                e0(a6hVar);
                break;
        }
    }

    @snc(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (E()) {
        }
        a6h a6hVar = a6h.AUTO;
        if (str == null) {
            f0(a6hVar);
            return;
        }
        switch (str) {
            case "stretch":
                f0(a6h.STRETCH);
                break;
            case "baseline":
                f0(a6h.BASELINE);
                break;
            case "center":
                f0(a6h.CENTER);
                break;
            case "flex-start":
                f0(a6h.FLEX_START);
                break;
            case "auto":
                f0(a6hVar);
                break;
            case "space-between":
                f0(a6h.SPACE_BETWEEN);
                break;
            case "flex-end":
                f0(a6h.FLEX_END);
                break;
            case "space-around":
                f0(a6h.SPACE_AROUND);
                break;
            default:
                s55.n("ReactNative", "invalid value for alignSelf: ".concat(str));
                f0(a6hVar);
                break;
        }
    }

    @snc(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        this.j0.x(f);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (E()) {
            return;
        }
        int iL0 = l0(trg.a[i]);
        this.j0.z(g6h.a(iL0), nn2.G(f));
    }

    @snc(name = "collapsable")
    public void setCollapsable(boolean z) {
    }

    @snc(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @defpackage.snc(name = "columnGap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setColumnGap(com.facebook.react.bridge.Dynamic r5) {
        /*
            r4 = this;
            boolean r0 = r4.E()
            if (r0 == 0) goto L7
            return
        L7:
            xm8$a r0 = r4.n0
            r0.a(r5)
            r6h r1 = r0.b
            int r1 = r1.ordinal()
            j6h r2 = defpackage.j6h.COLUMN
            com.facebook.yoga.a r4 = r4.j0
            if (r1 == 0) goto L28
            r3 = 1
            if (r1 == r3) goto L28
            r3 = 2
            if (r1 == r3) goto L22
            r3 = 3
            if (r1 == r3) goto L28
            goto L2d
        L22:
            float r0 = r0.a
            r4.L(r2, r0)
            goto L2d
        L28:
            float r0 = r0.a
            r4.K(r2, r0)
        L2d:
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm8.setColumnGap(com.facebook.react.bridge.Dynamic):void");
    }

    @snc(name = "display")
    public void setDisplay(String str) {
        if (E()) {
            return;
        }
        com.facebook.yoga.a aVar = this.j0;
        f6h f6hVar = f6h.FLEX;
        if (str == null) {
            aVar.C(f6hVar);
            return;
        }
        if (str.equals("flex")) {
            aVar.C(f6hVar);
        } else if (str.equals("none")) {
            aVar.C(f6h.NONE);
        } else {
            s55.n("ReactNative", "invalid value for display: ".concat(str));
            aVar.C(f6hVar);
        }
    }

    @snc(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (E()) {
            return;
        }
        this.j0.D(f);
    }

    @snc(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (E()) {
            return;
        }
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        com.facebook.yoga.a aVar2 = this.j0;
        if (iOrdinal == 0 || iOrdinal == 1) {
            aVar2.E(aVar.a);
        } else if (iOrdinal == 2) {
            aVar2.G(aVar.a);
        } else if (iOrdinal == 3) {
            aVar2.F();
        }
        dynamic.recycle();
    }

    @snc(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (E()) {
        }
        i6h i6hVar = i6h.COLUMN;
        if (str == null) {
            g0(i6hVar);
            return;
        }
        switch (str) {
            case "row-reverse":
                g0(i6h.ROW_REVERSE);
                break;
            case "column":
                g0(i6hVar);
                break;
            case "row":
                g0(i6h.ROW);
                break;
            case "column-reverse":
                g0(i6h.COLUMN_REVERSE);
                break;
            default:
                s55.n("ReactNative", "invalid value for flexDirection: ".concat(str));
                g0(i6hVar);
                break;
        }
    }

    @snc(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (E()) {
            return;
        }
        this.j0.I(f);
    }

    @snc(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (E()) {
            return;
        }
        this.j0.J(f);
    }

    @snc(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (E()) {
        }
        com.facebook.yoga.a aVar = this.j0;
        s6h s6hVar = s6h.NO_WRAP;
        if (str == null) {
            aVar.m0(s6hVar);
            return;
        }
        switch (str) {
            case "nowrap":
                aVar.m0(s6hVar);
                break;
            case "wrap-reverse":
                aVar.m0(s6h.WRAP_REVERSE);
                break;
            case "wrap":
                aVar.m0(s6h.WRAP);
                break;
            default:
                s55.n("ReactNative", "invalid value for flexWrap: ".concat(str));
                aVar.m0(s6hVar);
                break;
        }
    }

    @snc(name = "gap")
    public void setGap(Dynamic dynamic) {
        if (E()) {
            return;
        }
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        j6h j6hVar = j6h.ALL;
        com.facebook.yoga.a aVar2 = this.j0;
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            aVar2.K(j6hVar, aVar.a);
        }
        dynamic.recycle();
    }

    @snc(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (E()) {
            return;
        }
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            d(aVar.a);
        } else {
            com.facebook.yoga.a aVar2 = this.j0;
            if (iOrdinal == 2) {
                aVar2.P(aVar.a);
            } else if (iOrdinal == 3) {
                aVar2.O();
            }
        }
        dynamic.recycle();
    }

    @snc(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @tnc(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i, Dynamic dynamic) {
    }

    @tnc(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i, Dynamic dynamic) {
    }

    @snc(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (E()) {
        }
        k6h k6hVar = k6h.FLEX_START;
        if (str == null) {
            h0(k6hVar);
            return;
        }
        switch (str) {
            case "center":
                h0(k6h.CENTER);
                break;
            case "flex-start":
                h0(k6hVar);
                break;
            case "space-between":
                h0(k6h.SPACE_BETWEEN);
                break;
            case "flex-end":
                h0(k6h.FLEX_END);
                break;
            case "space-around":
                h0(k6h.SPACE_AROUND);
                break;
            case "space-evenly":
                h0(k6h.SPACE_EVENLY);
                break;
            default:
                s55.n("ReactNative", "invalid value for justifyContent: ".concat(str));
                h0(k6hVar);
                break;
        }
    }

    @tnc(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i, Dynamic dynamic) {
    }

    @tnc(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i, Dynamic dynamic) {
    }

    @tnc(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (E()) {
            return;
        }
        int iL0 = l0(trg.b[i]);
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            i0(aVar.a, iL0);
        } else {
            com.facebook.yoga.a aVar2 = this.j0;
            if (iOrdinal == 2) {
                aVar2.T(g6h.a(iL0), aVar.a);
            } else if (iOrdinal == 3) {
                aVar2.S(g6h.a(iL0));
            }
        }
        dynamic.recycle();
    }

    @snc(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (E()) {
            return;
        }
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        com.facebook.yoga.a aVar2 = this.j0;
        if (iOrdinal == 0 || iOrdinal == 1) {
            aVar2.U(aVar.a);
        } else if (iOrdinal == 2) {
            aVar2.V(aVar.a);
        }
        dynamic.recycle();
    }

    @snc(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (E()) {
            return;
        }
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        com.facebook.yoga.a aVar2 = this.j0;
        if (iOrdinal == 0 || iOrdinal == 1) {
            aVar2.W(aVar.a);
        } else if (iOrdinal == 2) {
            aVar2.X(aVar.a);
        }
        dynamic.recycle();
    }

    @snc(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (E()) {
            return;
        }
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        com.facebook.yoga.a aVar2 = this.j0;
        if (iOrdinal == 0 || iOrdinal == 1) {
            aVar2.Z(aVar.a);
        } else if (iOrdinal == 2) {
            aVar2.a0(aVar.a);
        }
        dynamic.recycle();
    }

    @snc(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (E()) {
            return;
        }
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        com.facebook.yoga.a aVar2 = this.j0;
        if (iOrdinal == 0 || iOrdinal == 1) {
            aVar2.b0(aVar.a);
        } else if (iOrdinal == 2) {
            aVar2.c0(aVar.a);
        }
        dynamic.recycle();
    }

    @snc(name = "overflow")
    public void setOverflow(String str) {
        if (E()) {
        }
        com.facebook.yoga.a aVar = this.j0;
        p6h p6hVar = p6h.VISIBLE;
        if (str == null) {
            aVar.d0(p6hVar);
            return;
        }
        switch (str) {
            case "hidden":
                aVar.d0(p6h.HIDDEN);
                break;
            case "scroll":
                aVar.d0(p6h.SCROLL);
                break;
            case "visible":
                aVar.d0(p6hVar);
                break;
            default:
                s55.n("ReactNative", "invalid value for overflow: ".concat(str));
                aVar.d0(p6hVar);
                break;
        }
    }

    @tnc(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i, Dynamic dynamic) {
    }

    @tnc(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i, Dynamic dynamic) {
    }

    @tnc(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (E()) {
            return;
        }
        int iL0 = l0(trg.b[i]);
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            r(aVar.a, iL0);
        } else if (iOrdinal == 2) {
            this.h0[iL0] = aVar.a;
            this.i0[iL0] = !dmc.m(r0);
            k0();
        }
        dynamic.recycle();
    }

    @snc(name = "position")
    public void setPosition(String str) {
        if (E()) {
            return;
        }
        com.facebook.yoga.a aVar = this.j0;
        q6h q6hVar = q6h.RELATIVE;
        if (str == null) {
            aVar.i0(q6hVar);
            return;
        }
        if (str.equals("relative")) {
            aVar.i0(q6hVar);
        } else if (str.equals("absolute")) {
            aVar.i0(q6h.ABSOLUTE);
        } else {
            s55.n("ReactNative", "invalid value for position: ".concat(str));
            aVar.i0(q6hVar);
        }
    }

    @tnc(names = {"start", "end", GesturesListener.SCROLL_DIRECTION_LEFT, GesturesListener.SCROLL_DIRECTION_RIGHT, "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (E()) {
            return;
        }
        int iL0 = l0(new int[]{4, 5, 0, 2, 1, 3}[i]);
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        com.facebook.yoga.a aVar2 = this.j0;
        if (iOrdinal == 0 || iOrdinal == 1) {
            aVar2.g0(g6h.a(iL0), aVar.a);
        } else if (iOrdinal == 2) {
            aVar2.h0(g6h.a(iL0), aVar.a);
        }
        dynamic.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @defpackage.snc(name = "rowGap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setRowGap(com.facebook.react.bridge.Dynamic r5) {
        /*
            r4 = this;
            boolean r0 = r4.E()
            if (r0 == 0) goto L7
            return
        L7:
            xm8$a r0 = r4.n0
            r0.a(r5)
            r6h r1 = r0.b
            int r1 = r1.ordinal()
            j6h r2 = defpackage.j6h.ROW
            com.facebook.yoga.a r4 = r4.j0
            if (r1 == 0) goto L28
            r3 = 1
            if (r1 == r3) goto L28
            r3 = 2
            if (r1 == r3) goto L22
            r3 = 3
            if (r1 == r3) goto L28
            goto L2d
        L22:
            float r0 = r0.a
            r4.L(r2, r0)
            goto L2d
        L28:
            float r0 = r0.a
            r4.K(r2, r0)
        L2d:
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm8.setRowGap(com.facebook.react.bridge.Dynamic):void");
    }

    @snc(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        this.e = z;
    }

    @snc(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z) {
    }

    @snc(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z) {
    }

    @snc(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z) {
    }

    @snc(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (E()) {
            return;
        }
        a aVar = this.n0;
        aVar.a(dynamic);
        int iOrdinal = aVar.b.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            G(aVar.a);
        } else {
            com.facebook.yoga.a aVar2 = this.j0;
            if (iOrdinal == 2) {
                aVar2.l0(aVar.a);
            } else if (iOrdinal == 3) {
                aVar2.k0();
            }
        }
        dynamic.recycle();
    }
}
