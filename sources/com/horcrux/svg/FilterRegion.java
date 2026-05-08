package com.horcrux.svg;

import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.SVGLength;
import defpackage.tb5;

/* JADX INFO: loaded from: classes2.dex */
public class FilterRegion {
    SVGLength mH;
    SVGLength mW;
    SVGLength mX;
    SVGLength mY;

    private double getRelativeOrDefault(VirtualView virtualView, SVGLength sVGLength, float f, double d) {
        return (sVGLength == null || sVGLength.b == SVGLength.UnitType.UNKNOWN) ? d : virtualView.relativeOn(sVGLength, f);
    }

    public Rect getCropRect(VirtualView virtualView, tb5 tb5Var, RectF rectF) {
        double relativeOrDefault;
        double dRelativeOnFraction;
        double dRelativeOnFraction2;
        double relativeOrDefault2;
        if (rectF == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (tb5Var == tb5.OBJECT_BOUNDING_BOX) {
            dRelativeOnFraction2 = virtualView.relativeOnFraction(this.mX, rectF.width()) + ((double) rectF.left);
            dRelativeOnFraction = virtualView.relativeOnFraction(this.mY, rectF.height()) + ((double) rectF.top);
            relativeOrDefault = virtualView.relativeOnFraction(this.mW, rectF.width());
            relativeOrDefault2 = virtualView.relativeOnFraction(this.mH, rectF.height());
        } else {
            float canvasWidth = virtualView.getSvgView().getCanvasWidth();
            float canvasHeight = virtualView.getSvgView().getCanvasHeight();
            double relativeOrDefault3 = getRelativeOrDefault(virtualView, this.mX, canvasWidth, rectF.left);
            double relativeOrDefault4 = getRelativeOrDefault(virtualView, this.mY, canvasHeight, rectF.top);
            relativeOrDefault = getRelativeOrDefault(virtualView, this.mW, canvasWidth, rectF.width());
            dRelativeOnFraction = relativeOrDefault4;
            dRelativeOnFraction2 = relativeOrDefault3;
            relativeOrDefault2 = getRelativeOrDefault(virtualView, this.mH, canvasHeight, rectF.height());
        }
        return new Rect((int) dRelativeOnFraction2, (int) dRelativeOnFraction, (int) (dRelativeOnFraction2 + relativeOrDefault), (int) (dRelativeOnFraction + relativeOrDefault2));
    }

    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.b(dynamic);
    }

    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.b(dynamic);
    }

    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.b(dynamic);
    }

    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.b(dynamic);
    }
}
