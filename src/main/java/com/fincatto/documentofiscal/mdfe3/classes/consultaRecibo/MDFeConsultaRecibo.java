package com.fincatto.documentofiscal.mdfe3.classes.consultaRecibo;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.StringValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * Created by Eldevan Nery Junior on 30/11/17.
 *
 * Pedido de Consulta do Recibo do MDF-e.
 *
 */
@Root(name = "consReciMDFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/mdfe")
public class MDFeConsultaRecibo extends DFBase {

    @Element(name = "tpAmb", required = false)
    private DFAmbiente ambiente;

    /**
     * Número do Recibo do envio de lote de MDF-e.
     */
    @Element(name = "nRec", required = false)
    private String numeroRecibo;

    @Attribute(name = "versao", required = false)
    private String versao;

    public DFAmbiente getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(final DFAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public String getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(String numeroRecibo) {
        this.numeroRecibo = StringValidador.validaIntervalo(numeroRecibo, 0,15, "Numero Recibo Lote MDFe", true);
    }

    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final String versao) {
        this.versao = versao;
    }
}
