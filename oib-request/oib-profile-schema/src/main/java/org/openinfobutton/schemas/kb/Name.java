//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.09 at 08:58:15 PM UTC 
//


package org.openinfobutton.schemas.kb;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="firstName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="lastName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "name")
public class Name {

    @XmlAttribute(name = "firstName")
    @XmlSchemaType(name = "anySimpleType")
    protected String firstName;
    @XmlAttribute(name = "lastName")
    @XmlSchemaType(name = "anySimpleType")
    protected String lastName;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Name.Builder<_B> _other) {
        _other.firstName = this.firstName;
        _other.lastName = this.lastName;
    }

    public<_B >Name.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new Name.Builder<_B>(_parentBuilder, this, true);
    }

    public Name.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static Name.Builder<Void> builder() {
        return new Name.Builder<Void>(null, null, false);
    }

    public static<_B >Name.Builder<_B> copyOf(final Name _other) {
        final Name.Builder<_B> _newBuilder = new Name.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Name.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree firstNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("firstName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(firstNamePropertyTree!= null):((firstNamePropertyTree == null)||(!firstNamePropertyTree.isLeaf())))) {
            _other.firstName = this.firstName;
        }
        final PropertyTree lastNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastNamePropertyTree!= null):((lastNamePropertyTree == null)||(!lastNamePropertyTree.isLeaf())))) {
            _other.lastName = this.lastName;
        }
    }

    public<_B >Name.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new Name.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public Name.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >Name.Builder<_B> copyOf(final Name _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final Name.Builder<_B> _newBuilder = new Name.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static Name.Builder<Void> copyExcept(final Name _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static Name.Builder<Void> copyOnly(final Name _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final Name _storedValue;
        private String firstName;
        private String lastName;

        public Builder(final _B _parentBuilder, final Name _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.firstName = _other.firstName;
                    this.lastName = _other.lastName;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final Name _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree firstNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("firstName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(firstNamePropertyTree!= null):((firstNamePropertyTree == null)||(!firstNamePropertyTree.isLeaf())))) {
                        this.firstName = _other.firstName;
                    }
                    final PropertyTree lastNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastNamePropertyTree!= null):((lastNamePropertyTree == null)||(!lastNamePropertyTree.isLeaf())))) {
                        this.lastName = _other.lastName;
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends Name >_P init(final _P _product) {
            _product.firstName = this.firstName;
            _product.lastName = this.lastName;
            return _product;
        }

        /**
         * Sets the new value of "firstName" (any previous value will be replaced)
         * 
         * @param firstName
         *     New value of the "firstName" property.
         */
        public Name.Builder<_B> withFirstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets the new value of "lastName" (any previous value will be replaced)
         * 
         * @param lastName
         *     New value of the "lastName" property.
         */
        public Name.Builder<_B> withLastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public Name build() {
            if (_storedValue == null) {
                return this.init(new Name());
            } else {
                return ((Name) _storedValue);
            }
        }

    }

    public static class Select
        extends Name.Selector<Name.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static Name.Select _root() {
            return new Name.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, Name.Selector<TRoot, TParent>> firstName = null;
        private com.kscs.util.jaxb.Selector<TRoot, Name.Selector<TRoot, TParent>> lastName = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.firstName!= null) {
                products.put("firstName", this.firstName.init());
            }
            if (this.lastName!= null) {
                products.put("lastName", this.lastName.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, Name.Selector<TRoot, TParent>> firstName() {
            return ((this.firstName == null)?this.firstName = new com.kscs.util.jaxb.Selector<TRoot, Name.Selector<TRoot, TParent>>(this._root, this, "firstName"):this.firstName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Name.Selector<TRoot, TParent>> lastName() {
            return ((this.lastName == null)?this.lastName = new com.kscs.util.jaxb.Selector<TRoot, Name.Selector<TRoot, TParent>>(this._root, this, "lastName"):this.lastName);
        }

    }

}
