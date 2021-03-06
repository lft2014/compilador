/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoConjComandos extends PConjComandos
{
    private PConjComandos _conjComandos_;
    private PComandoEnquanto _comandoEnquanto_;

    public AEnquantoConjComandos()
    {
        // Constructor
    }

    public AEnquantoConjComandos(
        @SuppressWarnings("hiding") PConjComandos _conjComandos_,
        @SuppressWarnings("hiding") PComandoEnquanto _comandoEnquanto_)
    {
        // Constructor
        setConjComandos(_conjComandos_);

        setComandoEnquanto(_comandoEnquanto_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoConjComandos(
            cloneNode(this._conjComandos_),
            cloneNode(this._comandoEnquanto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoConjComandos(this);
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

    public PComandoEnquanto getComandoEnquanto()
    {
        return this._comandoEnquanto_;
    }

    public void setComandoEnquanto(PComandoEnquanto node)
    {
        if(this._comandoEnquanto_ != null)
        {
            this._comandoEnquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoEnquanto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._conjComandos_)
            + toString(this._comandoEnquanto_);
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

        if(this._comandoEnquanto_ == child)
        {
            this._comandoEnquanto_ = null;
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

        if(this._comandoEnquanto_ == oldChild)
        {
            setComandoEnquanto((PComandoEnquanto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
