import React from 'react';

class Square extends React.Component {
    render() {
        var squareStyle = {
            height: 150,
            backgroundColor: this.props.color,
            border:"1px #858585 solid",
        };
        return (
            <div style={squareStyle}>

            </div>
        );
    }
}

class Label extends React.Component {
    render() {
        var lableStyle = {
            border:"1px #858585 solid",
            fontFamily: "sans-serif",
            fontWeight: "bold",
            padding: 15,
            margin: 0
        };
        return (
            <p style={lableStyle}>{this.props.color}</p>
        );
    }
}

class Card extends React.Component {
    render() {
        var cardStyle = {
            height: 200,
            width: 150,
            padding: 0,
            backgroundColor: "#FFF",
            WebkitFilter: "drop-shadow(0px 0px 7px #666)",
            filter: "drop-shadow(0px 0px 7px #666)",
            textAlign: "center",
        };

        return (
            <div className="tiaose" style={cardStyle}>
                <Square color={this.props.color}/>
                <Label color={this.props.color}/>
            </div>
        );
    }
}


var color = [
    "#Fa4b2a", "#62fa1b", "#249bfa", "#fae70e", "#fa18bb", "#430efa", "#14f1fa", "#fad2b2"
];
// var yanse = [];

class Show extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            // yanse: [
            //     "#Fa4b2a", "#62fa1b", "#249bfa", "#fae70e", "#fa18bb", "#430efa", "#14f1fa", "#fad2b2"
            // ]
            yanse:color
        };
        // yanse=this.state.yanse;
        this.addcard = this.addcard.bind(this);
    }

    addcard() {
        this.setState({
            yanse: color.push(document.getElementById('shuru').value)
        })

    }

    render() {
        return (
            <div>

                <input id="shuru" type="text" placeholder="输入颜色"/>
                <input type="submit" onClick={this.addcard} value="提交"/>

                <div className="tiaose">
                    {color.map(function (color) {
                        return (
                            <div className="tiaose">
                                <Card color={color}/>
                            </div>
                        )
                    })}
                </div>
            </div>
        )
    }
}

export default Show;