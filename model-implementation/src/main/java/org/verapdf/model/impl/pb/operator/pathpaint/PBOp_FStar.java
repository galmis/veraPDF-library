package org.verapdf.model.impl.pb.operator.pathpaint;

import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace;
import org.verapdf.model.operator.Op_FStar;

import java.util.List;

/**
 * @author Timur Kamalov
 */
public class PBOp_FStar extends PBOpFillPaint implements Op_FStar {

    private static final String OP_FSTAR_TYPE = "Op_FStar";

    public PBOp_FStar(List<COSBase> arguments, PDColorSpace colorSpace) {
        super(arguments, null, colorSpace);
        setType(OP_FSTAR_TYPE);
    }

}