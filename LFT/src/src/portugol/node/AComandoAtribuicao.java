/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AComandoAtribuicao extends PComandoAtribuicao
{
    private PVarDef _varDef_;
    private TAtribuicao _atribuicao_;
    private PExp _exp_;
    private TPontoevirgula _pontoevirgula_;

    public AComandoAtribuicao()
    {
        // Constructor
    }

    public AComandoAtribuicao(
        @SuppressWarnings("hiding") PVarDef _varDef_,
        @SuppressWarnings("hiding") TAtribuicao _atribuicao_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TPontoevirgula _pontoevirgula_)
    {
        // Constructor
        setVarDef(_varDef_);

        setAtribuicao(_atribuicao_);

        setExp(_exp_);

        setPontoevirgula(_pontoevirgula_);

    }

    @Override
    public Object clone()
    {
        return new AComandoAtribuicao(
            cloneNode(this._varDef_),
            cloneNode(this._atribuicao_),
            cloneNode(this._exp_),
            cloneNode(this._pontoevirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoAtribuicao(this);
    }

    public PVarDef getVarDef()
    {
        return this._varDef_;
    }

    public void setVarDef(PVarDef node)
    {
        if(this._varDef_ != null)
        {
            this._varDef_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varDef_ = node;
    }

    public TAtribuicao getAtribuicao()
    {
        return this._atribuicao_;
    }

    public void setAtribuicao(TAtribuicao node)
    {
        if(this._atribuicao_ != null)
        {
            this._atribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atribuicao_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TPontoevirgula getPontoevirgula()
    {
        return this._pontoevirgula_;
    }

    public void setPontoevirgula(TPontoevirgula node)
    {
        if(this._pontoevirgula_ != null)
        {
            this._pontoevirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoevirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._varDef_)
            + toString(this._atribuicao_)
            + toString(this._exp_)
            + toString(this._pontoevirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varDef_ == child)
        {
            this._varDef_ = null;
            return;
        }

        if(this._atribuicao_ == child)
        {
            this._atribuicao_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._pontoevirgula_ == child)
        {
            this._pontoevirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._varDef_ == oldChild)
        {
            setVarDef((PVarDef) newChild);
            return;
        }

        if(this._atribuicao_ == oldChild)
        {
            setAtribuicao((TAtribuicao) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._pontoevirgula_ == oldChild)
        {
            setPontoevirgula((TPontoevirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
