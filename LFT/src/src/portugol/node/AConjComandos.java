/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AConjComandos extends PConjComandos
{
    private PConjComandos _conjComandos_;
    private PComandoAvalie _comandoAvalie_;

    public AConjComandos()
    {
        // Constructor
    }

    public AConjComandos(
        @SuppressWarnings("hiding") PConjComandos _conjComandos_,
        @SuppressWarnings("hiding") PComandoAvalie _comandoAvalie_)
    {
        // Constructor
        setConjComandos(_conjComandos_);

        setComandoAvalie(_comandoAvalie_);

    }

    @Override
    public Object clone()
    {
        return new AConjComandos(
            cloneNode(this._conjComandos_),
            cloneNode(this._comandoAvalie_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConjComandos(this);
    }

    public PConjComandos getConjComandos()
    {
        return this._conjComandos_;
    }

    public void setConjComandos(PConjComandos node)
    {
        if(this._conjComandos_ != null)
        {
            this._conjComandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conjComandos_ = node;
    }

    public PComandoAvalie getComandoAvalie()
    {
        return this._comandoAvalie_;
    }

    public void setComandoAvalie(PComandoAvalie node)
    {
        if(this._comandoAvalie_ != null)
        {
            this._comandoAvalie_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoAvalie_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._conjComandos_)
            + toString(this._comandoAvalie_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._conjComandos_ == child)
        {
            this._conjComandos_ = null;
            return;
        }

        if(this._comandoAvalie_ == child)
        {
            this._comandoAvalie_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._conjComandos_ == oldChild)
        {
            setConjComandos((PConjComandos) newChild);
            return;
        }

        if(this._comandoAvalie_ == oldChild)
        {
            setComandoAvalie((PComandoAvalie) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
